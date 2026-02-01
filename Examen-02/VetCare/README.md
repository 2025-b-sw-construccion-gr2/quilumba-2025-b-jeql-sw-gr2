# VetCare - Sistema de Gestión Veterinaria

![CI Pipeline](https://github.com/2025-b-sw-construccion-gr2/quilumba-2025-b-jeql-sw-gr2/actions/workflows/ci.yml/badge.svg)

## 📋 Descripción

VetCare es un sistema web de gestión veterinaria que permite a clientes, veterinarios y administradores gestionar consultas, mascotas y usuarios de manera eficiente.

## 🏗️ Arquitectura

**Patrón**: MVC (Model-View-Controller)

**Capas**:
- **Presentación**: JSP (JavaServer Pages)
- **Controladores**: Servlets (Jakarta EE)
- **Lógica de Negocio**: DAO (Data Access Objects)
- **Persistencia**: JPA/Hibernate
- **Base de Datos**: PostgreSQL

## 🛠️ Stack Tecnológico

- **Backend**: Java 21
- **Framework Web**: Jakarta EE (Servlets, JSP, JSTL)
- **ORM**: JPA/Hibernate 6.4.4
- **Base de Datos**: PostgreSQL 42.7.2
- **API REST**: JAX-RS/Jersey 3.1.2
- **Build Tool**: Maven 3.x
- **Servidor**: Tomcat 10.x
- **CI/CD**: GitHub Actions

## 📦 Requisitos Previos

- Java JDK 21
- Maven 3.8+
- PostgreSQL 14+
- Git

## 🚀 Instalación y Ejecución Local

### 1. Clonar el repositorio

```bash
git clone https://github.com/2025-b-sw-construccion-gr2/quilumba-2025-b-jeql-sw-gr2.git
cd quilumba-2025-b-jeql-sw-gr2/Examen-02/VetCare
```

### 2. Configurar Base de Datos

Crear base de datos PostgreSQL:

```sql
CREATE DATABASE vetcare;
CREATE USER vetcare_user WITH PASSWORD 'vetcare_pass';
GRANT ALL PRIVILEGES ON DATABASE vetcare TO vetcare_user;
```

Configurar conexión en `src/main/resources/META-INF/persistence.xml`

### 3. Compilar el proyecto

```bash
mvn clean install
```

### 4. Ejecutar tests

```bash
mvn test
```

### 5. Ejecutar aplicación

```bash
mvn cargo:run
```

La aplicación estará disponible en: `http://localhost:8080/VetCare`

## 🔄 Pipeline CI/CD

El proyecto utiliza GitHub Actions para automatizar la validación del código.

### Jobs del Pipeline

#### 1️⃣ **Lint (Checkstyle)**
- Valida convenciones de código Java
- Verifica nomenclatura, imports, estructura
- Configuración: `checkstyle.xml`

```bash
mvn checkstyle:check
```

#### 2️⃣ **Format Check (Spotless)**
- Verifica formato de código con Google Java Format
- Asegura consistencia en todo el proyecto

```bash
mvn spotless:check
```

Para aplicar formato automáticamente:
```bash
mvn spotless:apply
```

#### 3️⃣ **Tests (JUnit + JaCoCo)**
- Ejecuta pruebas unitarias con JUnit 5
- Genera reporte de cobertura con JaCoCo
- Cobertura mínima requerida: 30%

```bash
mvn test
mvn jacoco:report
```

Ver reporte: `target/site/jacoco/index.html`

#### 4️⃣ **Build (Maven)**
- Compila el proyecto
- Genera archivo WAR
- Se ejecuta solo si los otros jobs pasan

```bash
mvn clean package
```

### Flujo del Pipeline

```
┌─────────────┐
│   Push/PR   │
└──────┬──────┘
       │
       ├──────────┬──────────┬──────────┐
       ▼          ▼          ▼          ▼
   ┌──────┐  ┌────────┐  ┌──────┐  ┌───────┐
   │ Lint │  │ Format │  │ Test │  │ Build │
   └──┬───┘  └───┬────┘  └──┬───┘  └───┬───┘
      │          │           │          │
      └──────────┴───────────┴──────────┘
                     │
                     ▼
              ✅ Pipeline OK
```

## 🌿 Flujo de Trabajo con Git

### Modelo de Ramas (Git Flow)

- **`main`**: Código en producción (estable)
- **`develop`**: Integración de nuevas funcionalidades
- **`feature/*`**: Desarrollo de nuevas características
- **`hotfix/*`**: Correcciones urgentes

### Proceso de Desarrollo

1. **Crear feature branch desde develop**
   ```bash
   git checkout develop
   git pull origin develop
   git checkout -b feature/nombre-feature
   ```

2. **Desarrollar y hacer commits**
   ```bash
   git add .
   git commit -m "Descripcion del cambio"
   ```

3. **Push y crear Pull Request**
   ```bash
   git push origin feature/nombre-feature
   ```

4. **Revisión de código**
   - Al menos un compañero debe revisar
   - Pipeline debe pasar (todos los jobs en verde)
   - Resolver comentarios si los hay

5. **Fusionar a develop**
   - Aprobar Pull Request
   - Fusionar usando "Squash and merge" o "Merge commit"
   - Eliminar rama feature

## 📊 Estructura del Proyecto

```
VetCare/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controlador/      # Servlets
│   │   │   ├── dao/               # Data Access Objects
│   │   │   ├── modelo/            # Entidades JPA
│   │   │   ├── recursos/          # Endpoints REST
│   │   │   └── soporte/           # Utilidades
│   │   ├── resources/
│   │   │   └── META-INF/
│   │   │       └── persistence.xml
│   │   └── webapp/
│   │       └── vista/             # JSP Views
│   └── test/
│       └── java/                  # Tests unitarios
├── .github/
│   └── workflows/
│       └── ci.yml                 # GitHub Actions
├── checkstyle.xml                 # Reglas de linting
├── pom.xml                        # Configuración Maven
└── README.md
```

## 🧪 Tests Unitarios

El proyecto incluye tests para:
- **Modelo**: `UsuarioTest`
- **DAO**: `ClienteDAOTest`, `MascotaDAOTest`, `VeterinarioDAOTest`
- **Controladores**: `ControlAutenticacionTest`

Ejecutar tests:
```bash
mvn test
```

Ver cobertura:
```bash
mvn jacoco:report
start target/site/jacoco/index.html
```

## ✨ Funcionalidades Implementadas

### Filtro de Búsqueda por Especie
- Método `buscarPorEspecie()` en `MascotaDAO`
- Búsqueda case-insensitive con JPA
- UI con agrupación visual por especies
- Contador de mascotas por especie

## 👥 Equipo

- **Estudiante**: Javier Esteban Quilumba Lema
- **Compañero de revisión**: Jonathan Michael Tipan Cachumba
- **Curso**: Construcción y Evolución de Software - 2025B

## 📝 Licencia

Este proyecto es parte del curso de Construcción y Evolución de Software de la EPN.

---

**Desarrollado con ❤️ para el Exámen-02 de Construcción y Evolución de Software**
