create table car_historical_data(
    id serial int,
    number varchar,
    mark varchar,
    price float8,
    date_delete timestamp
)

create or replace function car_delete() returns trigger as
$$
    begin
        insert into car_historical_data(number, mark, price, date_delete ) values
            (old.number, old.mark, old.price, now())
            return old;

    end;

$$
language 'plpgsql'

create trigger audit_cars after delete on car
for each row execute procedure car_delete();

create or replace procedure find_end_arend_car(number varchar, mark varchar, price int, new_price int ) as
$$
	begin
		if (new_price != price) then
			insert into car_historical_data(number, mark, price, date_delete ) values
			(number,mark,new_price,now());
		end if;
	commit;
	end;
$$
language 'plpgsql'