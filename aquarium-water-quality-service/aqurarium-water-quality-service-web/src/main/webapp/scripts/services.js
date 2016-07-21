'use strict';

var services = angular.module('WaterQualityServiceApp.services', ['ngResource']);

services.factory("valuesService", function ($resource) {
	return $resource("/waterQualityService", {}, {
		query: {
			method: "GET",
			isArray: true
		},
		save: {
			method: "POST"
		}
	});
});

services.factory("valueService", function ($resource) {
	return $resource("/waterQualityService/:id", {}, {
		delete: {
			method: "DELETE",
			params: { id: '@id' }
		}
	});
});