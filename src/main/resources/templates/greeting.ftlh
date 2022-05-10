<#import "parts/common.ftlh" as c>
<#include "parts/security.ftlh">

<@c.page>
    <link rel="stylesheet" href="/static/style_main.css" />
    <div class="page-header">
        <h4>Добро пожаловать ${user.fullName} </h4>
        <br>
        <h5><small>Данный сервис аренды автомобилей поможет вам быстро подобрать и получить авто</small></h5>
    </div>
    <br>

    <div class="container h-100">
        <h4>Часто задаваемые вопросы</h4>
        <br>
        <ul class="list-group">
            <#list feedBacks as q>
                <li class="list-group-item list-group-item-warning">${q.getQuestion()}</li>
                <li class="list-group-item">${q.getAnswer()}</li>
            </#list>
        </ul>
    </div>
</@c.page>


