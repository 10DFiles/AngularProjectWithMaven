/**
 * Routing to HTML File
 */
var studentapp = angular.module('AngularjsStudentCurd', [ 'ngRoute' ]);

studentapp.config([ '$routeProvider', function($routeProvider) {

	$routeProvider.when('/', {

		templateUrl : 'views/login.html'

	}).when('/welcome', {

		templateUrl : 'views/Welcome.html'
	}).when('/AddStudent', {

		templateUrl : 'views/AddStudent.html'
	}).when('/findStudent', {

		templateUrl : 'views/FindStudentByName.html'

	}).when('/deleteStudent', {

		templateUrl : 'views/deleteStudent.html'
	}).when('/UpdateStudent', {

		templateUrl : 'views/UpdateStudentById.html'
	}).when('/ListOfStudent', {

		templateUrl : 'views/ListOfStudent.html'
	}).otherwise({
		redirectTo : 'views/Welcome.html'
	});
} ]);
