var tinApp = angular.module('TinApp', []);

tinApp.controller('tinroof-controller', function($scope, $http) {

    $scope.register = function(registerUser) {
        console.log("About to register user");
        $http.post("/register.json", registerUser)
        .then(
            function successCallBack(response){
                console.log(response.data);
            },
            function errorCallBack(response){
                console.log("unable to register user");
            });
    };

    $scope.login = function() {

    };

});