<#import "parts/common.ftlh" as c>

<@c.page>
    <link rel="stylesheet" href="/static/style_main.css" />
    <div class="page-header">
        <h1>Список машин /<small> данные автомобили доступны для аренды</small></h1>
    </div>
    <p></p>

    <div class="list-group">
        <#list cars as car>
        <a href="#" class="list-group-item" c>
            <div class="p-3 mb-2 bg-secondary text-white">
            <h4 class="list-group-item-heading">${car.mark}</h4>
            <p class="list-group-item-text">${car.price}</p>
            </div>
        </a>

        </#list>

        </tbody>
    </div>
</@c.page>

