-- database
DROP DATABASE IF EXISTS workshop;
CREATE DATABASE workshop;

-- user
DROP USER IF EXISTS workshop;
CREATE USER workshop WITH PASSWORD 'workshop';

-- privileges
GRANT ALL PRIVILEGES ON DATABASE workshop TO workshop;
GRANT USAGE ON SCHEMA public TO workshop;
ALTER USER workshop WITH SUPERUSER;