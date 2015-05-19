var simpleWebAppControllers = angular.module('simpleWebAppControllers', []);

simpleWebAppControllers.controller('usersController', ['$scope', 'UsersFactory', 'UserFactory', '$location',
    function ($scope, UserFactory, UsersFactory, $location) {

        $scope.editUser = function (uid) {
            $location.path('/users/');
            console.log('edit user fired')
        };

        $scope.deleteUser = function (uid) {
            UserFactory.delete({id: uid});
            $scope.users = UsersFactory.query();
        };

        $scope.createNewUser = function () {
            $location.path('/newuser/');
        };

        $scope.users = UsersFactory.query();

    }]);

simpleWebApp.controller('userController', ['$scope', '$routeParams', 'UserFactory','$location',
    function ($scope, $routeParams, UserFactory, $location){

        $scope.updateUser = function () {
            UserFactory.update($scope.user);
            $location.path('/users')
        };

        $scope.cancel = function () {
            $location.path('/users')
        }

        $scope.user = UserFactory.show({id: $routeParams.id})


    }]);

simpleWebApp.controller('userCreationController', ['$scope', 'UsersFactory', '$location',
    function ($scope, UsersFactory, $location) {

        $scope.createNewUser = function () {
            UsersFactory.create($scope.user);
            $location.path('/users')
        }

    }]);