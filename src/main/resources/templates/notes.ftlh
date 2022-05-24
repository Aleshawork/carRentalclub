<#import "parts/common.ftlh" as c>

<@c.page>
    <link rel="stylesheet" href="/static/style_main.css" />

    <h1>Список понравившихся машин </h1>
    <br>
    <br>


    <div class="list-group">
        <div class="row">
            <#list notes as note>

                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <div class="caption">
                            <p class="font-weight-bolder" >Марка авто: ${note.car.mark} - ${note.car.markNumber}</p>
                            <p class="font-weight-bolder" >Стоимость аренды: ${note.car.price}</p>
                            <p class="font-weight-normal" >Цвет: ${note.car.color}</p>
                            <br>
                            <p class="font-weight-normal">
                                <a href="/car/${note.car.getRecordId()}" class="btn btn-primary" role="button">Подробнее</a>
                                <a href="/car/deletetop/${note.getRecordId()}" class="btn btn-default" role="button">Удалить из избранного</a>
                            </p>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</@c.page>