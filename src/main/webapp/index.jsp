<html>
    <head>
        <title>Simple Web Application</title>
    </head>
    <link  rel="stylesheet" href="webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="webjars/font-awesome/4.3.0/css/font-awesome.min.css">

    <script type="text/javascript" src="webjars/angularjs/1.3.15/angular.js"></script>
    <script type="text/javascript" src="webjars/angularjs/1.3.15/angular-resource.js"></script>
    <script type="text/javascript" src="webjars/angularjs/1.3.15/angular-route.js"></script>
    <script type="text/javascript" src="webjars/jquery/2.1.4/jquery.js"></script>

    <script type="text/javascript" src="js/app.js"></script>
    <script type="text/javascript" src="js/services.js"></script>
    <script type="text/javascript" src="js/controllers.js"></script>

    <body ng-app="simpleWebApp">

        <nav class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Simple WebApp</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#about">About</a></li>
                        <li><a href="#contact">Contact</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>

        <div class="container">
            <div ng-view></div>
        </div>

        <%--<div class="container">--%>
            <%--<div ng-controller="usersController">--%>

                <%--<div class="row">--%>
                    <%--<div class="col-md-12">--%>
                        <%--<p class="lead">--%>
                            <%--User Management System--%>
                        <%--</p>--%>
                    <%--</div>--%>
                <%--</div>--%>

                <%--<div class="row">--%>
                   <%--<div class="col-md-12">--%>
                        <%--<table class="table table-hover">--%>
                            <%--<thead>--%>
                                <%--<tr>--%>
                                    <%--<th>User ID</th>--%>
                                    <%--<th>Name</th>--%>
                                    <%--<th>Email</th>--%>
                                    <%--<th>DoB</th>--%>
                                    <%--<th>Phone</th>--%>
                                    <%--<th>Address</th>--%>
                                    <%--<th>Action</th>--%>
                                <%--</tr>--%>
                            <%--</thead>--%>
                            <%--<tbody>--%>
                                <%--<tr ng-repeat="u in users">--%>
                                    <%--<td>{{u.user.id}}</td>--%>
                                    <%--<td>{{u.user.name}}</td>--%>
                                    <%--<td>{{u.user.email}}</td>--%>
                                    <%--<td>{{u.user.dob}}</td>--%>
                                    <%--<td>{{u.user.telnumb}}</td>--%>
                                    <%--<td>{{u.user.address}}</td>--%>
                                    <%--<td>--%>
                                        <%--<a href="#" class="text-warning"><i class="fa fa-pencil-square-o"></i></a>--%>
                                        <%--<a href="#" class="text-danger"><i class="fa fa-trash-o"></i></a>--%>
                                    <%--</td>--%>
                                <%--</tr>--%>
                            <%--</tbody>--%>

                        <%--</table>--%>

                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="lead">2015</p>
                </div>
            </div>
        </div>
    </footer>
    </body>
</html>
