# 🎬 Videoclub Backend

Proyecto de backend desarrollado en Java con arquitectura MVC que conecta con una base de datos MySQL para gestionar un catálogo de películas.

---

## 📋 Descripción del proyecto

Aplicación de consola que implementa un sistema de gestión de un videoclub. Permite crear y consultar películas almacenadas en una base de datos MySQL, siguiendo el patrón de diseño **MVC (Modelo - Vista - Controlador)**.

---

## 🗂️ Estructura del proyecto

```
video-backend/
├── src/
│   └── main/
│       └── java/
│           └── org/videoclub/
│               ├── Main.java
│               ├── config/
│               │   └── DBManager.java
│               ├── controller/
│               │   └── MovieController.java
│               ├── model/
│               │   └── Movie.java
│               ├── repository/
│               │   └── MovieRepositoryImpl.java
│               └── view/
│                   └── MovieView.java
├── pom.xml
└── README.md
```

---

## 🛠️ Tecnologías usadas

| Tecnología        | Versión  |
|-------------------|----------|
| Java              | 17       |
| Maven             | 3.x      |
| MySQL             | 8.x      |
| MySQL Workbench   | 8.0      |
| MySQL Connector/J | 9.1.0    |
| JDBC              | Nativo   |

---

## ▶️ Cómo ejecutarlo

### 1. Clona el repositorio

```bash
git clone https://github.com/tu-usuario/video-backend.git
cd video-backend
```

### 2. Configura la base de datos

Crea la base de datos en MySQL:

```sql
CREATE DATABASE movies_app;

USE movies_app;

CREATE TABLE movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    director VARCHAR(255),
    genero VARCHAR(100),
    argumento TEXT,
    imagen VARCHAR(500),
    imageCartel VARCHAR(500),
    trailer VARCHAR(500)
);
```

### 3. Configura las credenciales

Abre `src/main/java/org/videoclub/config/DBManager.java` y ajusta si es necesario:

```java
private static final String URL = "jdbc:mysql://localhost:3306/movies_app";
private static final String USER = "root";
private static final String PASSWORD = "root";
```

### 4. Compila y ejecuta con Maven

```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.videoclub.Main"
```

---

## 📸 Capturas

### Base de datos — Tabla `movies` en MySQL Workbench

Consulta `SELECT * FROM movies` con **180 registros** insertados correctamente desde Java vía JDBC.

<img width="500" height="380" alt="MySQL Workbench" src="https://github.com/user-attachments/assets/107f7bf6-3d9d-4efb-b351-24548899b69f" />


### Compilación exitosa en IntelliJ

> Añade aquí una captura del build sin errores.

<img width="580" height="400" alt="image" src="https://github.com/user-attachments/assets/e9adf0ba-ad54-45c0-8a96-40ee12e4d768" />


---

## 👨‍💻 Autor

Desarrollado como proyecto de clase siguiendo el patrón MVC con Java y JDBC por Ana Morandeira
