var simpleWebApp = angular.module('simpleWebApp', ['simpleWebAppControllers', 'simpleWebAppServices','ngRoute']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/users', {templateUrl: 'views/showusers.html', controller: 'usersController'});
        $routeProvider.when('/users/:id', {templateUrl: 'views/edituser.html', controller: 'userController'});
        $routeProvider.when('/newuser', {templateUrl: 'views/createuser.html', controller: 'userCreationController'});
        $routeProvider.otherwise({redirectTo: '/users'})
    }]);
