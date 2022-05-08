<#import "parts/common.ftlh" as c>
<div class="row mx-md-n5">
    <div class="col px-md-5">
            <div class="card" style="width: 32rem;">
                <img src="${image}" class="card-img-top" style="max-width:120%;>
                    <div class="card-body">
                            <p class="card-text">Удобный для города кроссовер, которые позволит вам комфортно и быстро добираться до работы, а также выезжать за город</p>
                    </div>
            </div>
    </div>
    <div class="col px-md-5">
        <ul class="list-group">
            <li class="list-group-item">Стоимость аренды: ${car.price}руб.</li>
            <li class="list-group-item">Марка авто: ${car.mark}</li>
            <li class="list-group-item">Цвет авто: ${car.color}</li>
            <li class="list-group-item">Тип салона: ${car.typeOfCar}</li>
        </ul>
    </div>
</div>

<button class="btn btn-primary" type="submit">Арендовать</button>



