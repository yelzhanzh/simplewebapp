//angular.module('simpleWebApp.services', []).factory('User', function($resource) {
//    return $resource('http:/localhost:8090/com/rest/users')
//})

var simpleWebAppServices = angular.module('simpleWebAppServices',['ngResource']);

simpleWebAppServices.factory('UsersFactory',['$resource',
    function($resource) {
        return $resource('rest/users', {}, {
            query: {method: 'GET', isArray: true},
            create: {method: 'POST'}
        })
    }]);

simpleWebAppServices.factory('UserFactory',['$resource',
    function($resource) {
        return $resource('rest/users/:id', {}, {
            show: { method: 'GET' },
            update: {method: 'PUT', params: {id: '@id'}},
            delete: {method: 'DELETE', params: {id: '@id'}}
        })
    }]);

