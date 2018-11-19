<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>가게 좌석 현황</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/thumbnail-gallery.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">EAT NOW</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home
                <span class="sr-only"></span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="androidServlet">ADD RESERVATION</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#"></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#"></a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Page Content --> 
    <div class="container">

      <h1 class="my-4 text-center text-lg-left">가게 좌석 현황</h1>

      <div class="row text-center text-lg-left">

        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
            <div class="table2" style = "text-align:center; vertical-align:middle; color:yellow; background-color: red; height: 200px; width: 200px; border:1px solid black;">
           	박재현<br>010-xxxx-xxxx
            </div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
            <div class="table2" style = "height: 200px; width: 200px; border:1px solid black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
            <div class="table2" style = "height: 200px; width: 200px; border:1px solid black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
            <div class="table2" style = "height: 200px; width: 200px; border:1px solid black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
           <div class="table4" style = "height: 200px; width: 450px; border:1px solid black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
            <div class="table2" style = "height: 200px; width: 200px; border:1px black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
            <div class="table4" style = " text-align:center; vertical-align:middle; color:yellow; background-color: red;height: 200px; width: 450px; border:1px solid black;">
            김혁진<br>010-xxxx-xxxx</div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
           <div class="table2" style = "height: 200px; width: 200px; border:1px black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
         <div class="table10" style = "height: 200px; width: 900px; border:1px solid black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
          <div class="table2" style = "height: 200px; width: 200px; border:1px black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
            <div class="table2" style = "height: 200px; width: 200px; border:1px black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
			<div class="table2" style = "height: 200px; width: 200px; border:1px black;"></div>
          </a>
        </div>
        <div class="col-lg-3 col-md-4 col-xs-6">
          <a href="#" class="d-block mb-4 h-100">
         <div class="table10" style = "text-align:center; vertical-align:middle; color:yellow; background-color: red;height: 200px; width: 900px; border:1px solid black;">
         최현<br>010-xxxx-xxxx
         </div>
          </a>
        </div>
      </div>

    </div>
    <!-- /.container -->
	
	<form action = "androidServlet" method=POST>
      	<label for="customerName" >예약자 이름</label>
        <input type="text" name="customerName" class="form-control" placeholder="성명" required="" autofocus="">
        <label for="customerPhone" >전화 번호</label>
        <input type="text" name="customerPhone" class="form-control" placeholder="핸드폰 번호" required="">
	<button type="submit">ADD RESERVATION</button>
    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2017</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
