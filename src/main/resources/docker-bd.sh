# При первом запуске проекта локально выполняем следующий скрипт:
docker run --name db-local-dev -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -e POSTGRES_DB=car_rental_club -d postgres:13.3

# При повторном запуске (перезапуске контейнера) выполняем:
docker start db-local-dev