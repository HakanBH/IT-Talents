<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="UTF-8">
<title>Mobile.bg - Пазарът за автомобили в България.</title>
<meta http-equiv="X-UA-Compatible" content="IE = edge">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width = device-width, initial-scale = 1">

<script type="text/javascript" src="yoxview/yoxview-init.js"></script>
<script type="text/javascript" src="yoxview/lang/bg.js"></script>
<link href="css/styles.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
	<script
		src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
	<script
		src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>

	<%@ include file="header.jsp"%>

	<div class="container panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">Търсене</h3>
		</div>
		<div class="row">
			<div class="col-md-8">
				<hgroup class="mb20">
					<h1>Search Results</h1>
					<h2 class="lead">
						<strong class="text-danger">3</strong> results were found for the
						search for <strong class="text-danger">Mini Cooper</strong>
					</h2>
				</hgroup>
				<section class="col-xs-12 col-sm-6 col-md-12">
					<article class="search-result row">
						<div class="col-xs-12 col-sm-12 col-md-3">
							<a href="#" title="Lorem ipsum" class="thumbnail"><img
								src="images/cars/2980400b.jpg" alt="Mini Cooper"></a>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-2">
							<ul class="meta-search">
								<li><i class="glyphicon glyphicon-calendar"></i> <span>02/15/2016</span></li>
								<li><i class="glyphicon glyphicon-time"></i> <span>17:23</span></li>
								<li><i class="glyphicon glyphicon-tags"></i> <span>Таг</span></li>
							</ul>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-7 excerpet">
							<h3>
								<a href="#" title="">Mini Cooper - кабрио, употребяван</a>
							</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
								Voluptatem, exercitationem, suscipit, distinctio, qui sapiente
								aspernatur molestiae non corporis magni sit sequi iusto debitis
								delectus doloremque.</p>
							<span class="plus"><a href="#" title="Добави в любими"><i
									class="glyphicon glyphicon-plus"></i></a></span>
						</div>
						<span class="clearfix borda"></span>
					</article>

					<article class="search-result row">
						<div class="col-xs-12 col-sm-12 col-md-3">
							<a href="#" title="mini" class="thumbnail"><img
								src="images/cars/2980400b.jpg" alt="Mini Cooper"></a>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-2">
							<ul class="meta-search">
								<li><i class="glyphicon glyphicon-calendar"></i> <span>02/13/2014</span></li>
								<li><i class="glyphicon glyphicon-time"></i> <span>8:32</span></li>
								<li><i class="glyphicon glyphicon-tags"></i> <span>Таг</span></li>
							</ul>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-7">
							<h3>
								<a href="#" title="">Mini Cooper - кабрио, употребяван</a>
							</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
								Voluptatem, exercitationem, suscipit, distinctio, qui sapiente
								aspernatur molestiae non corporis magni sit sequi iusto debitis
								delectus doloremque.</p>
							<span class="plus"><a href="#" title="Добави в любими"><i
									class="glyphicon glyphicon-plus"></i></a></span>
						</div>
						<span class="clearfix borda"></span>
					</article>

					<article class="search-result row">
						<div class="col-xs-12 col-sm-12 col-md-3">
							<a href="#" title="mini" class="thumbnail"><img
								src="images/cars/2980400b.jpg" alt="Mini cooper"></a>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-2">
							<ul class="meta-search">
								<li><i class="glyphicon glyphicon-calendar"></i> <span>01/11/2014</span></li>
								<li><i class="glyphicon glyphicon-time"></i> <span>10:13
										am</span></li>
								<li><i class="glyphicon glyphicon-tags"></i> <span>Sport</span></li>
							</ul>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-7">
							<h3>
								<a href="#" title="">Mini Cooper - кабрио, употребяван</a>
							</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
								Voluptatem, exercitationem, suscipit, distinctio, qui sapiente
								aspernatur molestiae non corporis magni sit sequi iusto debitis
								delectus doloremque.</p>
							<span class="plus"><a href="#" title="Добави в любими"><i
									class="glyphicon glyphicon-plus"></i></a></span>
						</div>
						<span class="clearfix border"></span>
					</article>

				</section>



				<ul class="pager">
					<li class="previous"><a href="#">&larr;Предишна страница</a></li>
					<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li class="next"><a href="#">Следваща страница &rarr;</a></li>
				</ul>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>