<#import "parts/common.ftlh" as c>

<@c.page>
    Список понравившихся машин

    <table>
        <thead>
        <tr>
            <th>Марка</th>
            <th>Цвет</th>
            <th>Тип</th>
            <th>Цена</th>
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
