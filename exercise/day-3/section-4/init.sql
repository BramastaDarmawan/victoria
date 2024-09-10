CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    isbn VARCHAR(100) NOT NULL,
    author_id INT REFERENCES author(id),
    gnere_id INT REFERENCES genre(id),
    published_date DATE not NULL
);

CREATE TABLE author(
    id SERIAL PRIMARY KEY,
    author_name VARCHAR(100) NOT NULL,
    bio VARCHAR(100) NOT NULL
);

CREATE TABLE genre(
    id SERIAL PRIMARY KEY,
    genre_name VARCHAR(100) NOT NULL
);