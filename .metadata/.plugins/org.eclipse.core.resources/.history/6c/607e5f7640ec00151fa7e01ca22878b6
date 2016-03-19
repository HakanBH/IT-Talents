<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="UTF-8">
<title>Mobile.bg - Пазарът за автомобили в България.</title>
<meta http-equiv="X-UA-Compatible" content="IE = edge">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width = device-width, initial-scale = 1">

<link href="css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
<script src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>
<script src="js/validation.js"></script>	

<%@include file="header.jsp" %>	

<!-- Main body -->
<div class="container" style="background-color: white">
	<div class="row">
		<!-- New search column -->
		<form id="searchForm" action="Search" method="post" target="_blank">
			<div class="col-md-4">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">Търсене</h3>
					</div>
					<div class="search-form">
						<label class="control-label" for="category"> Основна категория</label> 
						<select id="category" name="category" class="form-control">
							<option value="all">Всички</option>
							<option value="car">Автомобили</option>
							<option value="jeep">Джипове</option>
							<option value="bus">Бусове</option>
							<option value="truck">Камиони</option>
							<option value="moto">Мотоциклети</option>
							<option value="аgro">Селскостопански</option>
							<option value="industr">Индустриални</option>
							<option value="carry">Кари</option>
							<option value="caravan">Каравани</option>
							<option value="trailer">Ремаркета</option>
							<option value="bikes">Велосипеди</option>
						</select>
					</div>
					
					<div class="row search-form">
						<div class="col-md-6">
							<label class="control-label" for="brand"> Марка</label> <select
								id="brand" name="brand" class="form-control">
								<option value="all">Всички</option>
								<option value="asd">Honda</option>
							</select>
						</div>
						<div class="col-md-6">
							<label class="control-label" for="model"> Модел</label> <select
								id="model" name="model" class="form-control">
								<option value="all">Всички</option>
								<option value="civic">Civic</option>
							</select>
						</div>
					</div>

					<div class="search-form">
						<label class="control-label" for="еngine"> Двигател</label> <select
							id="еngine" name="еngine" class="form-control">
							<option value="all">Всички</option>
							<option value="petrol">Бензинов</option>
							<option value="diesel">Дизелов</option>
							<option value="electric">Електрически</option>
							<option value="hybrid">Хибриден</option>
						</select>
					</div>
					<div class="search-form">
						<label class="control-label" for="gearbox"> Скоростна кутия</label>
						<select id="gearbox" name="gearbox" class="form-control">
							<option value="all">Всички</option>
							<option value="auto">Автоматична</option>
							<option value="semiauto">Полуавтоматична</option>
							<option value="manual">Ръчна</option>
						</select>
					</div>
				
					<div class="search-form">
						<label class="control-label"> Цена</label> <br>
						<input id="minPrice" name="minPrice" type="number" min="0" placeholder="От" 
							class="form-control input-md" style="width:49%; display: inline;"
							oninput="setCustomValidity('')" oninvalid="setCustomValidity('Въведете цена по-голяма от 0.')">
						<input id="maxPrice" name="maxPrice" type="number" min="#minPrice" placeholder="До" 
						    class="form-control input-md" style="width:49%;  display: inline;">
					</div>
	
					<div class="search-form">
						<label class="control-label">Година</label> <br>
						<input id="minYear" name="minYear" type="number" min="1950" max="2016" placeholder="От" 
							value="1950" class="form-control input-md" style="width:49%; display: inline;"
							oninput="setCustomValidity('')" oninvalid="setCustomValidity('Въведете валидна година.')">
						<input id="maxYear" name="maxYear" type="number" min="1950" max="2016" placeholder="До" 
							value="2016" class="form-control input-md" style="width:49%;  display: inline;"
							oninput="setCustomValidity('')" oninvalid="setCustomValidity('Въведете валидна година.')">
						
					</div>

					<div class="search-form2">
						<label class="control-label" for="condition">Състояние: </label>
						<label class="checkbox-inline" for="new"> 
							<input type="checkbox" name="condition" id="new" value="new" checked="checked"> Нов </label> 
						<label class="checkbox-inline" for="used"> 
							<input type="checkbox" name="condition" id="used" value="used"> Употребяван </label> 
						<label class="checkbox-inline" for="parts"> 
							<input type="checkbox" name="condition" id="parts" value="parts"> На части </label>
					</div>
					<div class="search-form2">
						<input type="submit" form="searchForm" class="btn btn-info btn-block" value = "Т Ъ Р С Е Н Е">
					</div>
				</div>
			</div>
		</form>
		
		<!-- News column -->
		<div class="col-md-5">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						<a href="http://automedia.investor.bg/"	style="text-decoration: none">Новини от Automedia.bg</a>
					</h3>
				</div>
				<div id="myCarousel" class="carousel slide">
					<!-- Carousel indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="	" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>

					<!-- Carousel items -->
					<div class="carousel-inner" style="background-color: black">
						<div class="item active">
							<a href="http://automedia.investor.bg/a/0-nachalo/26848-honda-spria-noviia-civic-zaradi-problem-s-motora/">
								<img src="http://automedia.investor.bg/images/assets/1454565973-01-1.jpg"
								alt="First slide">
							</a>
							<div class="carousel-caption">
								<a href="http://automedia.investor.bg/a/0-nachalo/26848-honda-spria-noviia-civic-zaradi-problem-s-motora/">
									Honda спря новия Civic заради проблем с мотора</a>
							</div>
						</div>

						<div class="item">
							<a href="http://automedia.investor.bg/a/0-nachalo/26817-poiavi-se-nov-konkurent-na-tesla/">
								<img src="http://automedia.investor.bg/images/assets/1454398260-763190-image-numerique-tomahawk-sera-presente.jpg"
								alt="Second slide">
							</a>
							<div class="carousel-caption">
								<a href="http://automedia.investor.bg/a/0-nachalo/26817-poiavi-se-nov-konkurent-na-tesla/">
									Появи се нов конкурент на Tesla</a>
							</div>
						</div>

						<div class="item">
							<a href="http://automedia.investor.bg/a/0-nachalo/26830-evropeicite-izbraha-honda-za-1/">
								<img src="http://automedia.investor.bg/images/assets/1454406907-RTXY02V.jpg"
								alt="Third slide">
							</a>
							<div class="carousel-caption">
								<a href="http://automedia.investor.bg/a/0-nachalo/26830-evropeicite-izbraha-honda-za-1/">
									Европейците избраха Honda за №1</a>
							</div>
						</div>
					</div>

					<!-- Carousel nav -->
					<a class="carousel-control left" href="#myCarousel"
						data-slide="prev">&lsaquo;</a> <a class="carousel-control right"
						href="#myCarousel" data-slide="next">&rsaquo;</a>
				</div>
				<div class="panel-footer"></div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">Регистрация</h3>
				</div>
				<div class="reg-panel">
					<form id="regForm" action="Registration" method="post" target="_blank">
						<div class="row form-group">
							<div class="col-md-6" style="padding-right: 2px">
								<input type="text" name="first_name" id="first_name"
								placeholder="Име" class="form-control input-md" required>								
							</div>
							<div class="col-md-6" style="padding-left: 2px">
								<input type="text" name="last_name" id="last_name"
								placeholder="Фамилия" class="form-control input-md" required>							
							</div>
						</div>
						
						<div class="form-group">
							<input type="text" name="region" id="region"
								class="form-control" placeholder="Регион" required>							
						</div>
						
						<div class="form-group">
							<input type="email" name="email" id="email"
								class="form-control" placeholder="E-мейл"  required>								
						</div>

						<div class="form-group">
							<input type="password" name="password" id="password"
								class="form-control" placeholder="Парола"  required>
						</div>
						
						<div class="form-group">
							<input type="password" name="passwordConfirm" id="passwordConfirm"
								class="form-control required equalTo'#password'" placeholder="Потвърждение">
						</div>
						
						<div class="form-group">
							При натискане на <strong class="label label-primary">
								Регистрация</strong> вие се съгласявате с нашите <a href="#"
								style="color: #337ab7" data-toggle="modal"
								data-target="#t_and_c_m">Условия</a>.
						</div>
						<div class="form-group">
							<input type="submit" form="regForm" value="Регистрация" class="btn btn-info btn-block">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>

<%@include file="footer.jsp" %>

</body>
</html>