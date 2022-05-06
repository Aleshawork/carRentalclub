<#import "parts/common.ftlh" as c>

<@c.page>
    <link rel="stylesheet" href="/static/style_main.css" />
    <p class="fs-1">Список понравившихся машин</p>
    <p></p>

    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Марка</th>
            <th scope="col">Цвет</th>
            <th scope="col">Тип</th>
            <th scope="col">Цена</th>
        </tr>
        </thead>
        <tbody>
        <#list notes as note>
            <tr>
                <td>${note.car.mark}</td>
                <td>${note.car.color}</td>
                <td>${note.car.typeOfCar}</td>
                <td>${note.car.price}</td>
<#--                <td><a href="/user/${user.id}">edit</a></td>-->
            </tr>
        </#list>
        </tbody>
    </table>
</@c.page>
