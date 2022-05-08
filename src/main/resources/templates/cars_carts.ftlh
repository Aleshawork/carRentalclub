<#import "parts/common.ftlh" as c>

<@c.page>
    <link rel="stylesheet" href="/static/style_main.css" />
    <div class="page-header">
        <h4>Список машин
            <small> данные автомобили доступны для аренды</small>
        </h4>
    </div>
    <p>

    </p>

    <div class="list-group">
        <div class="row">
        <#list cars as car>

                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src=${page_url} style="max-width:69%;">
                        <div class="caption">
                            <h2>Марка авто: ${car.mark}</h2>
                            <p>Стоимость аренды: ${car.price}</p>
                            <p>Тип салона: ${car.typeOfCar}</p>
                            <p>Цвет: ${car.color}</p>
                            <p>
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
