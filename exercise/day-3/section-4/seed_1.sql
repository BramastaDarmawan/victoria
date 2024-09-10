DO $$
DECLARE 
    i INT; 
    dept_count INT := 5;
BEGIN 
    FOR i IN 1..1000 LOOP
        INSERT INTO books (title, isbn, author_id, genre_id, published_date) 
        VALUES (
            i,
            'Title_' || i,  
            'ISBN-_' || i,
            (CURRENT_DATE - (floor(random() * 365 * 5)):int)
        );
        
        -- Insert salary for each employee
        INSERT INTO author (author_name, bio) 
        VALUES (
            i, 
            'Auhtor_' || i,
            'Bio_' || i 
        );
        
        INSERT INTO genre (genre_name) 
        VALUES (
            i, 
            'Genre_' || i
        );
    END LOOP;
END $$;
