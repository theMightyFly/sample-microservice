'use strict';

var WaterQualityServiceApp = angular.module('WaterQualityServiceApp', [
		'WaterQualityServiceApp.services',
		'WaterQualityServiceApp.controllers', 'ngRoute' ]);

// navigation routing
WaterQualityServiceApp.config(function($routeProvider) {
	$routeProvider

	// route for the home page
	.when('/', {
		templateUrl : 'pages/home.html',
		controller : 'homeController'
	})

	// route for the reports page
	.when('/reports', {
		templateUrl : 'pages/reports.html',
		controller : 'reportsController'
	})

});
