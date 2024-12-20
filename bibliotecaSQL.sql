-- Crear la base de datos
CREATE DATABASE Biblioteca;
USE Biblioteca;

-- Tabla: Libros
CREATE TABLE Libros (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(255) NOT NULL,
    Autor VARCHAR(255) NOT NULL,
    Genero VARCHAR(100) NOT NULL,
    Disponibilidad BOOLEAN NOT NULL DEFAULT TRUE,
    FechaPublicacion DATE
);

-- Tabla: Usuarios
CREATE TABLE Usuarios (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    DNI VARCHAR(15) NOT NULL UNIQUE,
    Nombre VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    Email VARCHAR(255) NOT NULL UNIQUE,
    Telefono VARCHAR(20),
    Rol ENUM('Administrador', 'Usuario estandar') NOT NULL
);

-- Tabla: Prestamos
CREATE TABLE Prestamos (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    LibroID INT NOT NULL,
    UsuarioID INT NOT NULL,
    FechaPrestamo DATE NOT NULL,
    FechaDevolucion DATE,
    MultaGenerada DECIMAL(10, 2) DEFAULT 0.00,
    FOREIGN KEY (LibroID) REFERENCES Libros(ID) ON DELETE CASCADE,
    FOREIGN KEY (UsuarioID) REFERENCES Usuarios(ID) ON DELETE CASCADE
);

-- Tabla: Reservas
CREATE TABLE Reservas (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    LibroID INT NOT NULL,
    UsuarioID INT NOT NULL,
    FechaReserva DATE NOT NULL,
    Estado ENUM('Pendiente', 'Completada', 'Cancelada') NOT NULL DEFAULT 'Pendiente',
    FOREIGN KEY (LibroID) REFERENCES Libros(ID) ON DELETE CASCADE,
    FOREIGN KEY (UsuarioID) REFERENCES Usuarios(ID) ON DELETE CASCADE
);