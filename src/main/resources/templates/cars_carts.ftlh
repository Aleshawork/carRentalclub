<#import "parts/common.ftlh" as c>

<@c.page>
    <link rel="stylesheet" href="/static/style_main.css" />
    <div class="page-header">
        <h4>Список машин
            <small> данные автомобили доступны для аренды</small>
        </h4>
    </div>

    <h1>Список машин /<small> данные автомобили доступны для аренды</small></h1>
    </div>

    <br>
    <div class="container h-100">
        <h3>Установите фильтры для поиска</h3>
            <form method="get" action="/car/filter">
                    <br>
                    <h4>Цвет</h4>
                    <select class="form-select" aria-label="Цвет" name="color">
                        <option selected></option>
                        <option value="blue">Синий</option>
                        <option value="black">Черный</option>
                        <option value="white">Белый</option>
                        <option value="red">Красный</option>
                    </select>
                    <br>
                    <h4>Марка</h4>
                    <select class="form-select" aria-label="Марка автомобиля" name="mark">
                        <option selected></option>
                        <option selected>bmv</option>
                        <option value="reno">reno</option>
                        <option value="audi">audi</option>
                        <option value="lexus">lexus</option>
                    </select>
                <br>
                <br>
                <button class="btn btn-primary" type="submit">Применить фильтры</button>
                <br>
                <br>
            </form>
    <div>


    <div class="list-group">
        <div class="row">
        <#list cars as car>

                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src=${car.getImageUrl()} style="max-width:69%;">
                        <div class="caption">
                            <class="font-weight-normal">Марка авто: ${car.mark} - ${car.markNumber}</p>
                            <p class="font-weight-bolder" >Стоимость аренды: ${car.price}</p>
                            <p class="font-weight-normal" >Тип салона: ${car.typeOfCar}</p>
                            <p class="font-weight-normal" >Цвет: ${car.color}</p>
                            <br>
                            <p class="font-weight-normal">
                                <a href="/car/${car.recordId}" class="btn btn-primary" role="button">Подробнее</a>
                                <a href="/car/addtop/${car.recordId}" class="btn btn-default" role="button">Добавить в избранное</a>
                            </p>
                        </div>
                    </div>
                </div>
            </a>
        </#list>
        </div>
    </div>
</@c.page>
