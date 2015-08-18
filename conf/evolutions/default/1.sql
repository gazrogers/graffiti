# --- !Ups

create table "graffiti" (
    "graffitiId" BIGINT NOT NULL PRIMARY KEY,
    "contentType" VARCHAR NOT NULL,
    "content" VARCHAR NOT NULL,
    "latitude" DECIMAL(9,6) NOT NULL,
    "longitude" DECIMAL(9,6) NOT NULL,
    "northlatitude" DECIMAL(9,6) NOT NULL,
    "southlatitude" DECIMAL(9,6) NOT NULL,
    "eastlongitude" DECIMAL(9,6) NOT NULL,
    "westlongitude" DECIMAL(9,6) NOT NULL,
    "created" BIGINT NOT NULL,
    "timetolive" INT NOT NULL,
    "userId" BIGINT NOT NULL
);
create table "user" (
    "userId" BIGINT NOT NULL PRIMARY KEY,
    "username" VARCHAR NOT NULL
);

# --- !Downs

drop table "graffiti";
drop table "user";