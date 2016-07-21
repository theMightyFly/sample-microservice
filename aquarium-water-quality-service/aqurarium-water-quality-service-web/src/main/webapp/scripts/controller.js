/*******************************************************************************
 *  Copyright 2016 by Ralf Schäftlein
 *  
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  
 *  
 *******************************************************************************/
var app = angular.module('WaterQualityServiceApp.controllers', ['ui.bootstrap', 'ngResource']);

app.controller("HttpController", [
	'$scope',
	'$resource',
	'valuesService',
	'valueService',
	function ($scope, $resource, valuesService, valueService) {

		$scope.sortType = 'measureTime'; // set the default sort type
		$scope.sortReverse = false; // set the default sort order

		// init
		var data = valuesService.query();
		$scope.waterquality = data;

        // delete a entry
		$scope.removeRow = function (id) {
			valueService.delete({
				id: id
			}, function (success) {
				$scope.refreshTable();
			});
		}

		$scope.refreshTable = function() {
			//$scope.waterquality.length = 0;
			var data = valuesService.query();
			$scope.waterquality = data;
		}

		// save input form via rest service
		$scope.saveNewMeasurement = function () {
			// create json
			var data = {
				nitrate: $scope.nitrate,
				nitrite: $scope.nitrite,
				totalHardness: $scope.totalHardness,
				carbonateHardness: $scope.carbonateHardness,
				ph: $scope.ph,
				chlorine: $scope.chlorine
			};
			// post to server
			var resource = valuesService.save(data);
			// update
			$scope.refreshTable();
			// clear input fields
			$scope.nitrate = '';
			$scope.nitrite = '';
			$scope.totalHardness = '';
			$scope.carbonateHardness = '';
			$scope.ph = '';
			$scope.chlorine = '';
		}


	}]);
