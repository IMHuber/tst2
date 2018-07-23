
var app = angular.module('app', ['ngRoute','ngResource']);

app.config(function($routeProvider){
    $routeProvider
        .when('/users',{
            templateUrl: '/app/users/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: '/app/roles/roles.html',
            controller: 'rolesController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});