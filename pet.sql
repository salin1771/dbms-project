-- Create User table
CREATE TABLE User (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(20) NOT NULL,
    email VARCHAR(20) NOT NULL,
    password VARCHAR(20) NOT NULL
);

-- Create Pet table
CREATE TABLE Pet (
    pet_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    species VARCHAR(20) NOT NULL,
    breed VARCHAR(20) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(7) NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);

-- Create AdoptionDetails table
CREATE TABLE AdoptionDetails (
    adoptation_id INT PRIMARY KEY,
    user_id INT NOT NULL,
    pet_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User(user_id),
    FOREIGN KEY (pet_id) REFERENCES Pet(pet_id)
);

-- Insert example data into User table
INSERT INTO User (user_name, email, password) VALUES
('Alice', 'alice@example.com', 'password123'),
('Bob', 'bob@example.com', 'password456'),
('Charlie', 'charlie@example.com', 'password789'),
('David', 'david@example.com', 'password101'),
('Eve', 'eve@example.com', 'password202');

-- Insert example data into Pet table
INSERT INTO Pet (name, species, breed, age, gender, user_id) VALUES
('Buddy', 'Dog', 'Golden Retriever', 3, 'Male', 1),
('Mittens', 'Cat', 'Siamese', 2, 'Female', 2),
('Charlie', 'Dog', 'Beagle', 4, 'Male', 3),
('Bella', 'Cat', 'Persian', 1, 'Female', 4),
('Max', 'Dog', 'Bulldog', 5, 'Male', 5);

-- Insert example data into AdoptionDetails table
INSERT INTO AdoptionDetails (adoptation_id, user_id, pet_id) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);
