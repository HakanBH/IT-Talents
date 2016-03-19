<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang = en>
<head>
<meta charset="UTF-8">
<title>Mobile.bg - Пазарът за автомобили в България.</title>
<meta http-equiv = "X-UA-Compatible" content = "IE = edge">
<meta name = "viewport" content = "width = device-width, initial-scale = 1">
 
<link href = "css/bootstrap.min.css" rel = "stylesheet">
</head>

<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
<script src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>

<%@include file = "header.jsp" %>

<div class="container panel-heading panel-primary" style="border-bottom: 1px solid #ccc; padding-bottom: 25px">
	<div class="panel-heading">
		<h4> Търсене на автомобили </h4>
	</div>
	<div class="panel-primary" style="padding-top:20px">
	<div class="col-md-4">
		<div class="search-form">	
			<label class="control-label" for="category">Основна категория</label>
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
			<label class="control-label" for="brand">Марка</label>
			<select id="brand" name="brand" class="form-control">
				<option value="all">Всички</option>
		 		<option value="asd">Honda</option>			 		 
			</select>
		 </div>
		 <div class="col-md-6">
			<label class="control-label" for="model">Модел</label>
		 	<select id="model" name="model" class="form-control">
		 		<option value="all">Всички</option>
		 		<option value="civic">Civic</option>			 	
		 	</select>
		  </div>
		 </div>
		 
		 <div class="search-form">
		 	<label class="control-label" for="engine">Двигател</label>
		 	<select id="engine" name="engine" class="form-control">
		 		<option value="all">Всички</option>
		 		<option value="petrol">Бензинов</option>
		 		<option value="diesel">Дизелов</option>
		 		<option value="electric">Електрически</option>
		 		<option value="hybrid">Хибриден</option> 
		 	</select>
		 </div>
		 <div class="search-form">
		 	<label class="control-label" for="gearbox">Скоростна кутия</label>
		 	<select id="gearbox" name="gearbox" class="form-control">
		 		<option value="all">Всички</option>
		 		<option value="auto">Автоматична</option>
		 		<option value="semiauto">Полуавтоматична</option>
		 		<option value="manual">Ръчна</option>
		 	</select>
		</div>
		 <div class="row search-form2">
			<div class="col-md-4">
				<label class="control-label" for="min-price">Цена</label>
		  		<input id="min-price" name="min-price" type="text" placeholder="От" class="form-control input-md">
			</div>
			<div class="col-md-4">
				<label class="control-label" for="max-price"></label>
		  		<input id="max-price" name="max-price" type="text" placeholder="До" style="margin-top: 3px;" class="form-control input-md">
			</div>
			<div class="col-md-4">
				<label class="control-label" for="currency">Валута</label>
		 			<select id="currency" name="currency" class="form-control">
		 			<option value="lv">лв.</option>
		 			<option value="usd">USD</option>
		 			<option value="euro">EUR</option>
		 		</select>
		 	</div>
		 		                      
		</div>
	</div>
	
	<div class="col-md-4">
		<div class="coll-md-12" style="margin-top: 25px">
			<label class="control-label" for="condition">Състояние</label>
				<label class="checkbox-inline" for="new">
			    	<input type="checkbox" name="condition" id="new" value="new" checked="checked"> Нов
			   	</label> 
		   		<label class="checkbox-inline" for="used">
		    			<input type="checkbox" name="condition" id="used" value="used"> Употребяван
		   		</label> 
		   		<label class="checkbox-inline" for="parts">
		     			<input type="checkbox" name="condition" id="parts" value="parts"> На части
		   		</label> 
	    </div>	
	    
	    <label class="control-label search-form2" for="min-power">Мощност</label>
		 <div class="row">
			<div class="col-md-6">
		  		<input id="min-power" name="min-power" type="text" placeholder="От" class="form-control input-md">
			</div>
			<div class="col-md-6">
		  		<input id="max-power" name="max-power" type="text" placeholder="До" class="form-control input-md">
			</div>
		</div>
		
		<label class="control-label search-form2" for="min-year">Година на производство</label>
		<div class="row">
			<div class="col-md-6">
		  		<input id="min-year" name="min-year" type="text" placeholder="От" class="form-control input-md">
			</div>
			<div class="col-md-6">
		  		<input id="min-year" name="min-year" type="text" placeholder="До" class="form-control input-md">
			</div>
		</div>
		
		<label class="control-label search-form2" for="min-km">Пробег</label>
		<div class="row">
			<div class="col-md-6">
				<select id="min-km" name="min-km" class="form-control">
					<option value="от">от</option>
		 			<option value="5000">от 5000</option>
		 			<option value="10000">от 10000</option>
		 			<option value="20000">от 20000</option>
		 			<option value="30000">от 30000</option>
		 			<option value="40000">от 40000</option>
		 			<option value="50000">от 50000</option>
		 			<option value="60000">от 60000</option>
		 			<option value="70000">от 70000</option>
		 			<option value="80000">от 80000</option>
		 			<option value="90000">от 90000</option>
		 			<option value="100000">от 1000000</option>
					<option value="125000">от 1250000</option>
					<option value="150000">от 1500000</option>		 			
		 		</select>
		 	</div>
			<div class="col-md-6">
				<select id="min-km" name="min-km" class="form-control">
					<option value="до">до</option>
		 			<option value="5000">до 5000</option>
		 			<option value="10000">до 10000</option>
		 			<option value="20000">до 20000</option>
		 			<option value="30000">до 30000</option>
		 			<option value="40000">до 40000</option>
		 			<option value="50000">до 50000</option>
		 			<option value="60000">до 60000</option>
		 			<option value="70000">до 70000</option>
		 			<option value="80000">до 80000</option>
		 			<option value="90000">до 90000</option>
		 			<option value="100000">до 1000000</option>
					<option value="125000">до 1250000</option>
					<option value="150000">до 1500000</option>		 			
		 		</select>
			</div>
		</div>
			<label class="control-label search-form2" for="color">Цвят</label>
				<select id="color" name="color" class="form-control">
					<option value="">всички цветове</option>
					<option value="Tъмно син">Tъмно син</option>
					<option value="Банан">Банан</option>
					<option value="Беата">Беата</option>
					<option value="Бежов">Бежов</option>
					<option value="Бордо">Бордо</option>
					<option value="Бронз">Бронз</option>
					<option value="Бял">Бял</option>
					<option value="Винен">Винен</option>
					<option value="Виолетов">Виолетов</option>
					<option value="Вишнев">Вишнев</option>
					<option value="Графит">Графит</option>
					<option value="Жълт">Жълт</option>
					<option value="Зелен">Зелен</option>
					<option value="Златист">Златист</option>
					<option value="Кафяв">Кафяв</option>
					<option value="Керемиден">Керемиден</option>
					<option value="Кремав">Кремав</option>
					<option value="Лилав">Лилав</option>
					<option value="Металик">Металик</option>
					<option value="Оранжев">Оранжев</option>
					<option value="Охра">Охра</option>
					<option value="Пепеляв">Пепеляв</option>
					<option value="Перла">Перла</option>
					<option value="Пясъчен">Пясъчен</option>
					<option value="Резидав">Резидав</option>
					<option value="Розов">Розов</option>
					<option value="Сахара">Сахара</option>
					<option value="Светло сив">Светло сив</option>
					<option value="Светло син">Светло син</option>
					<option value="Сив">Сив</option>
					<option value="Син">Син</option>
					<option value="Слонова кост">Слонова кост</option>
					<option value="Сребърен">Сребърен</option>
					<option value="Т.зелен">Т.зелен</option>
					<option value="Тъмно сив">Тъмно сив</option>
					<option value="Тъмно син мет.">Тъмно син мет.</option>
					<option value="Тъмно червен">Тъмно червен</option>
					<option value="Тютюн">Тютюн</option>
					<option value="Хамелеон">Хамелеон</option>
					<option value="Червен">Червен</option>
					<option value="Черен">Черен</option>
				</select>
	</div>
	<div class="col-md-4">
		<div class="search-form">
		 	<label class="control-label" for="subcategory">Категория</label>
		 	<select id="subcategory" name="subcategory" class="form-control">
				<option value="all">Всички</option>
		 		<option value="sedan">Седан</option>
		 		<option value="cabrio">Кабрио</option>
		 	</select>
		</div>
		<div class="row search-form">
		 <div class="col-md-6">
			<label class="control-label" for="region">Регион</label>
			<select id="region" name="region" class="form-control">
				<option value="">всички региони</option>
				<option value="Благоевград">Благоевград</option>
				<option value="Бургас">Бургас</option>
				<option value="Варна">Варна</option>
				<option value="Велико Търново">Велико Търново</option>
				<option value="Видин">Видин</option>
				<option value="Враца">Враца</option>
				<option value="Габрово">Габрово</option>
				<option value="Добрич">Добрич</option>
				<option value="Дупница">Дупница</option>
				<option value="Кърджали">Кърджали</option>
				<option value="Кюстендил">Кюстендил</option>
				<option value="Ловеч">Ловеч</option>
				<option value="Монтана">Монтана</option>
				<option value="Пазарджик">Пазарджик</option>
				<option value="Перник">Перник</option>
				<option value="Плевен">Плевен</option>
				<option value="Пловдив">Пловдив</option>
				<option value="Разград">Разград</option>
				<option value="Русе">Русе</option>
				<option value="Силистра">Силистра</option>
				<option value="Сливен">Сливен</option>
				<option value="Смолян">Смолян</option>
				<option value="София">София</option>
				<option value="Стара Загора">Стара Загора</option>
				<option value="Търговище">Търговище</option>
				<option value="Хасково">Хасково</option>
				<option value="Шумен">Шумен</option>
				<option value="Ямбол">Ямбол</option>
				<option value="Извън страната">Извън страната</option>			 		 
			</select>
		 </div>
		 <div class="col-md-6">
			<label class="control-label" for="location">Населено място</label>
		 	<select id="location" name="location" class="form-control">
		 		<option value="all">Всички</option>
		 		<option value="civic">Шумен</option>			 	
		 	</select>
		  </div>
		 </div>	
		 <div class="search-form2">
	    	<label class="control-label" for="sortBy">Сортирай според</label>
		 	<select id="sortBy" name="sortBy" class="form-control">
		 		<option value="1">VIP/Марка/Модел/Цена</option>
				<option value="2">Марка/Модел/Цена</option>
				<option value="3">Цена</option>
				<option value="4">Дата на производство</option>
				<option value="5">Пробег</option>
				<option value="6">Най-новите обяви</option>
				<option value="7">Най-новите обяви от посл. 2 дни</option>		 	
		 	</select>
	    </div>
		<div class="search-form2">
	    	<button type="submit" class="btn btn-info btn-block" style="height: 50px">Т Ъ Р С Е Н Е</button>
	    </div>
	  </div>
	</div>
</div>

<div class="container extras" >
	<div class="row ">
		<div class="col-md-4">
			<label class="control-label" for="safety">Безопасност</label>
			<label class="checkbox" for="safety1">
			 	<input type="checkbox" name="safety" id="safety1" value="safety1">GPS система за проследяване
			</label>
			<label class="checkbox" for="safety2">
				<input type="checkbox" name="safety" id="safety2" value="safety2">Автоматичен контрол на стабилността
 			</label>
 			<label class="checkbox" for="safety3">
 				<input type="checkbox" name="safety" id="safety3" value="safety3">Адаптивни предни светлини
			</label>
			<label class="checkbox" for="safety4">
				<input type="checkbox" name="safety" id="safety4" value="safety4">Антиблокираща система
			</label>
			<label class="checkbox" for="safety5">
				<input type="checkbox" name="safety" id="safety5" value="safety5">Въздушни възглавници - Задни
			</label>
			<label class="checkbox" for="safety6">
				<input type="checkbox" name="safety" id="safety6" value="safety6">Въздушни възглавници - Предни
			</label>
			<label class="checkbox" for="safety7">
				<input type="checkbox" name="safety" id="safety7" value="safety7">Въздушни възглавници - Странични
			</label>
			<label class="checkbox" for="safety8">
				<input type="checkbox" name="safety" id="safety8" value="safety8"> Ел. разпределяне на спирачното усилие
			</label>
			<label class="checkbox" for="safety9">
				<input type="checkbox" name="safety" id="safety9" value="safety9">Електронна програма за стабилизиране
			</label>
			<label class="checkbox" for="safety10">
				<input type="checkbox" name="safety" id="safety10" value="safety10">Контрол на налягането на гумите
			</label>
			<label class="checkbox" for="safety11">
				<input type="checkbox" name="safety" id="safety11" value="safety11"> Парктроник
			</label>
			<label class="checkbox" for="safety12">
				<input type="checkbox" name="safety" id="safety12" value="safety12">Система за динамична устойчивост
			</label>
			<label class="checkbox" for="safety13">
				<input type="checkbox" name="safety" id="safety13" value="safety13">Система за защита от пробуксуване
			</label>
			<label class="checkbox" for="safety14">
				<input type="checkbox" name="safety" id="safety14" value="safety14">Система за изсушаване на накладките
			</label>
			<label class="checkbox" for="safety15">
				<input type="checkbox" name="safety" id="safety15" value="safety15">Система за контрол на дистанцията
			</label>
			<label class="checkbox" for="safety16">
				<input type="checkbox" name="safety" id="safety16" value="safety16">Система за подпомагане на спирането
		  	</label>
		</div>
		<div class="col-md-3">
			<label class="control-label" for="comfort">Комфорт</label>
			 <label class="checkbox" for="comfort1">
			 	<input type="checkbox" name="comfort" id="comfort1" value="comfort1">Auto Start Stop function
 			</label>
 			<label class="checkbox" for="comfort2">
			 	<input type="checkbox" name="comfort" id="comfort2" value="comfort2">Bluetooth \ handsfree система
 			</label>
 			<label class="checkbox" for="comfort3">
			 	<input type="checkbox" name="comfort" id="comfort3" value="comfort3">DVD, TV
			</label>
 			<label class="checkbox" for="comfort4">
			 	<input type="checkbox" name="comfort" id="comfort4" value="comfort4">Steptronic, Tiptronic
			</label>
			<label class="checkbox" for="comfort5">
			 	<input type="checkbox" name="comfort" id="comfort5" value="comfort5"> USB, audio\video, IN\AUX изводи
			</label>
			<label class="checkbox" for="comfort6">
			 	<input type="checkbox" name="comfort" id="comfort6" value="comfort6">Адаптивно въздушно окачване
			</label>
			<label class="checkbox" for="comfort7">
			 	<input type="checkbox" name="comfort" id="comfort7" value="comfort7">Безключово палене 
 			</label>
 			<label class="checkbox" for="comfort8">
			 	<input type="checkbox" name="comfort" id="comfort8" value="comfort8">Блокаж на диференциала
 			</label>
 			<label class="checkbox" for="comfort9">
			 	<input type="checkbox" name="comfort" id="comfort9" value="comfort9">Бордкомпютър
 			</label>
 			<label class="checkbox" for="comfort10">
			 	<input type="checkbox" name="comfort" id="comfort10" value="comfort10">Датчик за светлина
			</label>
			<label class="checkbox" for="comfort11">
			 	<input type="checkbox" name="comfort" id="comfort11" value="comfort11"> Ел. Огледала
 			</label>
 			<label class="checkbox" for="comfort12">
			 	<input type="checkbox" name="comfort" id="comfort12" value="comfort12">Ел. Стъкла
 			</label>
 			<label class="checkbox" for="comfort13">
			 	<input type="checkbox" name="comfort" id="comfort13" value="comfort13">Ел. регулиране на окачването
 			</label>
 			<label class="checkbox" for="comfort14">
			 	<input type="checkbox" name="comfort" id="comfort14" value="comfort14">Ел. регулиране на седалките
 			</label>
 			<label class="checkbox" for="comfort15">
			 	<input type="checkbox" name="comfort" id="comfort15" value="comfort15">Ел. усилвател на волана
 			</label>
 			<label class="checkbox" for="comfort16">
			 	<input type="checkbox" name="comfort" id="comfort16" value="comfort16">Климатик
			</label>
			<label class="checkbox" for="comfort17">
			 	<input type="checkbox" name="comfort" id="comfort17" value="comfort17"> Климатроник
			</label>
			<label class="checkbox" for="comfort18">
			 	<input type="checkbox" name="comfort" id="comfort18" value="comfort18"> Мултифункционален волан
			</label>
			<label class="checkbox" for="comfort19">
			 	<input type="checkbox" name="comfort" id="comfort19" value="comfort19"> Навигация
 			</label>
 			<label class="checkbox" for="comfort20">
			 	<input type="checkbox" name="comfort" id="comfort20" value="comfort20">Отопление на волана
 			</label>
 			<label class="checkbox" for="comfort21">
			 	<input type="checkbox" name="comfort" id="comfort21" value="comfort21">Печка
 			</label>
 			<label class="checkbox" for="comfort22">
			 	<input type="checkbox" name="comfort" id="comfort22" value="comfort22">Подгряване на предното стъкло
			</label>
			<label class="checkbox" for="comfort23">
			 	<input type="checkbox" name="comfort" id="comfort23" value="comfort23">Подгряване на седалките
 			</label>
 			<label class="checkbox" for="comfort24">
			 	<input type="checkbox" name="comfort" id="comfort24" value="comfort24">Регулиране на волана
			</label>
 			<label class="checkbox" for="comfort25">
			 	<input type="checkbox" name="comfort" id="comfort25" value="comfort25">Сензор за дъжд
	 		</label>
	 		<label class="checkbox" for="comfort26">
			 	<input type="checkbox" name="comfort" id="comfort26" value="comfort26">Серво усилвател на волана
 			</label>
 			<label class="checkbox" for="comfort27">
			 	<input type="checkbox" name="comfort" id="comfort27" value="comfort27">Система за измиване на фаровете
 			</label>	
 			<label class="checkbox" for="comfort28">
			 	<input type="checkbox" name="comfort" id="comfort28" value="comfort28">Система за контрол на скоростта(автопилот)
 			</label>
 			<label class="checkbox" for="comfort29">
			 	<input type="checkbox" name="comfort" id="comfort29" value="comfort29">Стерео уредба
 			</label>
 			<label class="checkbox" for="comfort30">
			 	<input type="checkbox" name="comfort" id="comfort30" value="comfort30">Филтър за твърди частици
			</label>
			<label class="checkbox" for="comfort31">
			 	<input type="checkbox" name="comfort" id="comfort31" value="comfort31">Хладилна жабка
			</label>
		</div>
		<div class="col-md-2">
			<label class="control-label" for="other"> Други </label>
			<label class="checkbox" for="other1">
			 	<input type="checkbox" name="other1" id="other1" value="other1">4x4
 			</label>
 			<label class="checkbox" for="other2">
			 	<input type="checkbox" name="other" id="other2" value="other2">7 места
		 	</label>
		 	<label class="checkbox" for="other3">
			 	<input type="checkbox" name="other" id="other3" value="other3">Buy back
			</label>
			<label class="checkbox" for="other4">
			 	<input type="checkbox" name="other" id="other4" value="other4">Бартер
			</label>
			<label class="checkbox" for="other5">
			 	<input type="checkbox" name="other" id="other5" value="other5">Газова уредба
			</label>
			<label class="checkbox" for="other6">
			 	<input type="checkbox" name="other" id="other6" value="other6">Капариран\Продаден
			</label>
			<label class="checkbox" for="other7">
			 	<input type="checkbox" name="other" id="other7" value="other7">Катастрофирал
			</label>
			<label class="checkbox" for="other8">
			 	<input type="checkbox" name="other" id="other8" value="other8">Лизинг
			</label>
			<label class="checkbox" for="other9">
			 	<input type="checkbox" name="other" id="other9" value="other9">Метанова уредба
			</label>
			<label class="checkbox" for="other10">
			 	<input type="checkbox" name="other" id="other10" value="other10">На части
			</label>
			<label class="checkbox" for="other11">
			 	<input type="checkbox" name="other" id="other11" value="other11">Напълно обслужен
			</label>
			<label class="checkbox" for="other12">
			 	<input type="checkbox" name="other" id="other12" value="other12">Нов внос
			</label>
			<label class="checkbox" for="other13">
			 	<input type="checkbox" name="other" id="other13" value="other13">С право на дан.к-т
			</label>
			<label class="checkbox" for="other14">
			 	<input type="checkbox" name="other" id="other14" value="other14">С регистрация
			</label>
			<label class="checkbox" for="other15">
			 	<input type="checkbox" name="other" id="other15" value="other15">Сервизна книжка
			</label>
			<label class="checkbox" for="other16">
			 	<input type="checkbox" name="other" id="other16" value="other16">Тунинг
			</label>
		
			<label class="control-label" for="exterior">Екстериор</label>
			<label class="checkbox" for="exterior1">
			 	<input type="checkbox" name="exterior" id="exterior1" value="exterior1">2(3) Врати
		 	</label>
		 	<label class="checkbox" for="exterior2">
			 	<input type="checkbox" name="exterior" id="exterior2" value="exterior2">4(5) Врати
			</label>
			<label class="checkbox" for="exterior3">
			 	<input type="checkbox" name="exterior" id="exterior3" value="exterior3">LED фарове
			</label>
			<label class="checkbox" for="exterior4">
			 	<input type="checkbox" name="exterior" id="exterior4" value="exterior4">Ксенонови фарове
			</label>
			<label class="checkbox" for="exterior5">
			 	<input type="checkbox" name="exterior" id="exterior5" value="exterior5">Лети джанти
			</label>
			<label class="checkbox" for="exterior6">
			 	<input type="checkbox" name="exterior" id="exterior6" value="exterior6">Металик
			</label>
			<label class="checkbox" for="exterior7">
			 	<input type="checkbox" name="exterior" id="exterior7" value="exterior7">Отопляеми чистачки
			</label>
			<label class="checkbox" for="exterior8">
			 	<input type="checkbox" name="exterior" id="exterior8" value="exterior8">Панорамен люк
			</label>
			<label class="checkbox" for="exterior9">
			 	<input type="checkbox" name="exterior" id="exterior9" value="exterior9">Спойлери
			</label>
			<label class="checkbox" for="exterior10">
			 	<input type="checkbox" name="exterior" id="exterior10" value="exterior10">Теглич
			</label>
			<label class="checkbox" for="exterior11">
			 	<input type="checkbox" name="exterior" id="exterior11" value="exterior11">Халогенни фарове
			</label>
			<label class="checkbox" for="exterior12">
			 	<input type="checkbox" name="exterior" id="exterior12" value="exterior12">Шибедах
			</label>
		</div>
		<div class="col-md-3">
			<label class="control-label" for="security">Защита</label>
			<label class="checkbox" for="security1">
			 	<input type="checkbox" name="security" id="security1" value="security1">Аларма
			</label>
			<label class="checkbox" for="security2">
			 	<input type="checkbox" name="security" id="security2" value="security2">Брониран
			</label>
			<label class="checkbox" for="security3">
			 	<input type="checkbox" name="security" id="security3" value="security3">Имобилайзер
			</label>
			<label class="checkbox" for="security3">
			 	<input type="checkbox" name="security" id="security3" value="security3">Каско
			</label>
			<label class="checkbox" for="security3">
			 	<input type="checkbox" name="security" id="security3" value="security3">Централно заключване
			</label>
			
			
			<label class="control-label" for="interior">Интериор</label>
 			<label class="checkbox" for="interior1">
			 	<input type="checkbox" name="interior" id="interior1" value="interior1">Велурен салон
 			</label>
 			<label class="checkbox" for="interior2">
			 	<input type="checkbox" name="interior" id="interior2" value="interior2">Десен волан
 			</label>
 			<label class="checkbox" for="interior3">
			 	<input type="checkbox" name="interior" id="interior3" value="interior3">Кожен салон
			</label>
			
			<label class="control-label" for="special">Специализирани</label>
 			<label class="checkbox" for="special1">
			 	<input type="checkbox" name="special" id="special1" value="special1">TAXI</label>
 			<label class="checkbox" for="special2">
			 	<input type="checkbox" name="special" id="special2" value="special2">За хора с увреждания</label>
 			<label class="checkbox" for="special3">
			 	<input type="checkbox" name="special" id="special3" value="special3">Катафалка</label>
 			<label class="checkbox" for="special4">
			 	<input type="checkbox" name="special" id="special4" value="special4">Линейка</label>
 			<label class="checkbox" for="special5">
			 	<input type="checkbox" name="special" id="special5" value="special5">Учебен</label>
 			<label class="checkbox" for="special6">
			 	<input type="checkbox" name="special" id="special6" value="special6">Хладилен</label>
		</div>
	</div>
</div>

<%@ include file = "footer.jsp" %>

</body>
</html>