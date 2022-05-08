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

            <br>
            <h4>Цвет</h4>
            <select class="form-select" aria-label="Цвет">
                <option selected>Не учитывать</option>
                <option value="1">Синий</option>
                <option value="2">Черный</option>
                <option value="3">Белый</option>
                <option value="4">Красный</option>
            </select>
            <br>
            <h4>Марка</h4>
            <select class="form-select" aria-label="Марка автомобиля">
                <option selected>BMV</option>
                <option value="1">Reno</option>
                <option value="2">Audi</option>
                <option value="3">Lexus</option>
            </select>
        <br>
        <br>
        <button class="btn btn-primary" type="submit">Применить фильтры</button>
        <br>
        <br>
    <div>


    <div class="list-group">
        <div class="row">
        <#list cars as car>

                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src=${page_url} style="max-width:69%;">
                        <div class="caption">
                            <class="font-weight-normal">Марка авто: ${car.mark}</p>
                            <p class="font-weight-bolder" >Стоимость аренды: ${car.price}</p>
                            <p class="font-weight-normal" >Тип салона: ${car.typeOfCar}</p>
                            <p class="font-weight-normal" >Цвет: ${car.color}</p>
                            <br>
                            <p class="font-weight-normal">
                                <a href="/car/${car.recordId}" class="btn btn-primary" role="button">Подробнее</a>
                                <a href="#" class="btn btn-default" role="button">Добавить в избранное</a>
                            </p>
                        </div>
                    </div>
                </div>
            </a>
        </#list>
        </div>

        </tbody>
    </div>
</@c.page>
