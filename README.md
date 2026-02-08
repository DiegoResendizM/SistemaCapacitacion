[README.md](https://github.com/user-attachments/files/25170936/README.md)
# 📚 Sistema de Capacitación

Sistema integral de gestión académica desarrollado en Java con interfaz gráfica Swing para administrar cursos, estudiantes, capacitaciones y calificaciones de forma eficiente y profesional.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)
![File I/O](https://img.shields.io/badge/File_IO-TXT-green?style=for-the-badge)

## 📋 Tabla de Contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Módulos del Sistema](#módulos-del-sistema)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Formato de Archivos](#formato-de-archivos)
- [Capturas de Pantalla](#capturas-de-pantalla)
- [Contribuir](#contribuir)
- [Roadmap](#roadmap)
- [Licencia](#licencia)

## 📖 Descripción

Sistema de Capacitación es una aplicación de escritorio diseñada para instituciones educativas y centros de capacitación que necesitan gestionar:

- 📖 **Catálogo de Cursos**: Registro completo de cursos con código, nombre, descripción, duración y costo
- 👨‍🎓 **Base de Estudiantes**: Gestión de información personal y de contacto
- 🎓 **Capacitaciones**: Asignación de estudiantes a cursos específicos
- 📊 **Calificaciones**: Registro y seguimiento del desempeño académico

Ideal para:
- Centros de capacitación empresarial
- Institutos técnicos
- Academias y escuelas
- Programas de educación continua
- Proyectos académicos de programación

## ✨ Características

### Funcionalidades Generales
- 🎨 **Interfaz Gráfica Profesional**: Diseño limpio y fácil de usar con Java Swing
- 💾 **Persistencia de Datos**: Almacenamiento en archivos de texto plano (.txt)
- 🔄 **Navegación de Registros**: Botones Anterior/Siguiente para navegar entre registros
- ✅ **Validación de Datos**: Verificación de campos obligatorios y formatos
- 🗑️ **Operaciones CRUD**: Crear, Leer, Actualizar y Eliminar registros
- 🚀 **Splash Screen**: Pantalla de bienvenida animada
- 🏠 **Menú Principal**: Navegación centralizada entre módulos

### Módulo de Cursos
- ✅ Registro de cursos con código único
- ✅ Información detallada: nombre, descripción, horas, costo
- ✅ Validación de códigos duplicados
- ✅ Validación de horas (entero positivo) y costo (número válido)
- ✅ Navegación entre registros guardados
- ✅ Eliminación con confirmación

### Módulo de Estudiantes
- ✅ Gestión de matrícula única por estudiante
- ✅ Datos personales: nombre completo (nombre, apellido paterno, materno)
- ✅ Información de contacto: correo electrónico y teléfono
- ✅ Validación de matrículas duplicadas
- ✅ Navegación y eliminación de registros

### Módulo de Capacitaciones
- ✅ Asignación de estudiantes a cursos
- ✅ Relación matrícula-código de curso
- ✅ Validación de existencia de estudiantes y cursos
- ✅ Control de inscripciones duplicadas
- ✅ Gestión completa de asignaciones

### Módulo de Calificaciones
- ✅ Registro de notas por estudiante y curso
- ✅ Validación de rango de calificaciones (0-100)
- ✅ Verificación de inscripciones previas
- ✅ Consulta de desempeño académico
- ✅ Actualización de calificaciones

## 🔧 Requisitos

### Software Necesario
- **Java Development Kit (JDK)** 8 o superior
- **NetBeans IDE** 8.2 o superior (recomendado)
- **Sistema Operativo**: Windows, macOS o Linux

### Requisitos de Hardware
- **Procesador**: 1 GHz o superior
- **RAM**: Mínimo 512 MB (recomendado 2 GB)
- **Disco Duro**: 50 MB de espacio libre
- **Pantalla**: Resolución mínima 1024x768

## 📥 Instalación

### Método 1: Clonar desde GitHub

```bash
# Clonar el repositorio
git clone https://github.com/tu-usuario/sistema-capacitacion.git

# Navegar al directorio
cd sistema-capacitacion

# Abrir en NetBeans o tu IDE favorito
```

### Método 2: Importar en NetBeans

1. Descarga el proyecto como ZIP
2. Abre NetBeans IDE
3. **File → Open Project**
4. Selecciona la carpeta del proyecto
5. Clic derecho en el proyecto → **Run**

### Método 3: Compilación Manual

```bash
# Compilar todas las clases
javac -d bin *.java

# Ejecutar la aplicación
java -cp bin SplashScreen
```

## 🚀 Uso

### Inicio de la Aplicación

1. **Ejecutar** la clase `SplashScreen.java`
2. Esperar 3 segundos para que aparezca el **Menú Principal**
3. Seleccionar el módulo deseado

### Flujo de Trabajo Recomendado

```
1. CURSOS
   └─ Registrar todos los cursos disponibles
      
2. ESTUDIANTES
   └─ Registrar información de los estudiantes
      
3. CAPACITACIONES
   └─ Inscribir estudiantes en cursos
      
4. CALIFICACIONES
   └─ Registrar y consultar calificaciones
```

### Operaciones Básicas

#### Guardar un Registro
1. Completar todos los campos obligatorios
2. Clic en **"GUARDAR"**
3. El sistema valida y confirma el guardado
4. Los campos se limpian automáticamente

#### Navegar entre Registros
1. Usar botones **"ANTERIOR"** / **"SIGUIENTE"**
2. El sistema muestra un mensaje si está en el primero/último registro
3. Los datos se actualizan automáticamente en pantalla

#### Eliminar un Registro
1. Navegar al registro deseado
2. Clic en **"ELIMINAR"**
3. Confirmar la eliminación en el diálogo
4. El registro se elimina del archivo

#### Regresar al Menú
- Clic en **"SALIR"** en cualquier módulo
- El menú principal se abre automáticamente

## 📦 Módulos del Sistema

### 1. SplashScreen (Pantalla de Bienvenida)
**Archivo**: `SplashScreen.java`

**Características**:
- Pantalla de inicio con logo del sistema
- Timer de 3 segundos
- Transición automática al menú principal
- Sin decoración de ventana (borderless)

**Componentes**:
- Logo institucional
- Texto "BIENVENIDO"
- Nombre del sistema

---

### 2. Menú Principal
**Archivo**: `MenuPrincipal.java`

**Opciones**:
- 📖 **CURSOS** - Gestión de catálogo de cursos
- 👨‍🎓 **ESTUDIANTES** - Administración de estudiantes
- 🎓 **CAPACITACIONES** - Asignación de cursos
- 📊 **CALIFICACIONES** - Registro de notas
- 🚪 **SALIR** - Cerrar el sistema (con confirmación)

---

### 3. Módulo de Cursos
**Archivo**: `Cursos.java` | **Persistencia**: `cursos.txt`

**Campos**:
| Campo | Tipo | Descripción | Obligatorio |
|-------|------|-------------|-------------|
| Código | String | Identificador único del curso | ✅ |
| Nombre | String | Nombre completo del curso | ✅ |
| Descripción | String | Detalles del curso | ❌ |
| Horas | Integer | Duración en horas | ✅ |
| Costo | Double | Precio del curso | ✅ |

**Validaciones**:
- Código único (no puede duplicarse)
- Horas debe ser entero positivo (> 0)
- Costo debe ser número válido (≥ 0)
- Campos obligatorios no pueden estar vacíos

**Ejemplo de Registro**:
```
Código: JAVA-101
Nombre: Programación en Java Básico
Descripción: Introducción a la programación orientada a objetos
Horas: 40
Costo: 2500.00
```

---

### 4. Módulo de Estudiantes
**Archivo**: `Estudiantes.java` | **Persistencia**: `estudiantes.txt`

**Campos**:
| Campo | Tipo | Descripción | Obligatorio |
|-------|------|-------------|-------------|
| Matrícula | String | Identificador único del estudiante | ✅ |
| Nombre | String | Nombre(s) del estudiante | ✅ |
| Apellido Paterno | String | Primer apellido | ✅ |
| Apellido Materno | String | Segundo apellido | ✅ |
| Correo | String | Email de contacto | ✅ |
| Teléfono | String | Número telefónico | ✅ |

**Validaciones**:
- Matrícula única (no puede duplicarse)
- Todos los campos son obligatorios
- Formato básico de datos

**Ejemplo de Registro**:
```
Matrícula: EST-2024-001
Nombre: Juan Carlos
Apellido Paterno: García
Apellido Materno: López
Correo: juan.garcia@email.com
Teléfono: 5551234567
```

---

### 5. Módulo de Capacitaciones
**Archivo**: `Capacitaciones.java` | **Persistencia**: `capacitaciones.txt`

**Campos**:
| Campo | Tipo | Descripción | Obligatorio |
|-------|------|-------------|-------------|
| Matrícula | String | ID del estudiante | ✅ |
| Código Curso | String | ID del curso | ✅ |

**Validaciones**:
- El estudiante debe existir en `estudiantes.txt`
- El curso debe existir en `cursos.txt`
- No se permite inscripción duplicada
- Ambos campos son obligatorios

**Ejemplo de Registro**:
```
Matrícula: EST-2024-001
Código Curso: JAVA-101
```

---

### 6. Módulo de Calificaciones
**Archivo**: `Calificaciones.java` | **Persistencia**: `calificaciones.txt`

**Campos**:
| Campo | Tipo | Descripción | Obligatorio |
|-------|------|-------------|-------------|
| Matrícula | String | ID del estudiante | ✅ |
| Código Curso | String | ID del curso | ✅ |
| Calificación | Integer | Nota del 0-100 | ✅ |

**Validaciones**:
- El estudiante debe estar inscrito en el curso (verificación en `capacitaciones.txt`)
- Calificación debe estar en rango 0-100
- No permite calificaciones duplicadas (se puede actualizar)

**Ejemplo de Registro**:
```
Matrícula: EST-2024-001
Código Curso: JAVA-101
Calificación: 95
```

## 📁 Estructura del Proyecto

```
sistema-capacitacion/
│
├── src/
│   ├── SplashScreen.java          # Pantalla de bienvenida
│   ├── MenuPrincipal.java         # Menú principal
│   ├── MenuPrincipal.form         # Diseño GUI del menú
│   ├── Cursos.java                # Módulo de cursos
│   ├── Cursos.form                # Diseño GUI de cursos
│   ├── Estudiantes.java           # Módulo de estudiantes
│   ├── Estudiantes.form           # Diseño GUI de estudiantes
│   ├── Capacitaciones.java        # Módulo de capacitaciones
│   ├── Capacitaciones.form        # Diseño GUI de capacitaciones
│   ├── Calificaciones.java        # Módulo de calificaciones
│   └── Calificaciones.form        # Diseño GUI de calificaciones
│
├── resources/
│   └── logo/
│       └── logo.png               # Logo del sistema
│
├── data/                          # Archivos generados automáticamente
│   ├── cursos.txt                 # Base de datos de cursos
│   ├── estudiantes.txt            # Base de datos de estudiantes
│   ├── capacitaciones.txt         # Base de datos de inscripciones
│   └── calificaciones.txt         # Base de datos de calificaciones
│
├── README.md                      # Este archivo
├── .gitignore                     # Archivos ignorados por Git
└── LICENSE                        # Licencia MIT
```

## 📄 Formato de Archivos

### cursos.txt
```
JAVA-101;Programación en Java Básico;Introducción a POO;40;2500.00
WEB-201;Desarrollo Web Frontend;HTML, CSS, JavaScript;60;3500.00
BD-301;Bases de Datos SQL;MySQL y PostgreSQL;50;3000.00
```

**Formato**: `codigo;nombre;descripcion;horas;costo`

---

### estudiantes.txt
```
EST-001;Juan Carlos;García;López;juan.garcia@email.com;5551234567
EST-002;María Elena;Rodríguez;Martínez;maria.rodriguez@email.com;5559876543
EST-003;Pedro Antonio;Hernández;Sánchez;pedro.hernandez@email.com;5556543210
```

**Formato**: `matricula;nombre;apellidoP;apellidoM;correo;telefono`

---

### capacitaciones.txt
```
EST-001;JAVA-101
EST-001;WEB-201
EST-002;JAVA-101
EST-003;BD-301
```

**Formato**: `matricula;codigoCurso`

---

### calificaciones.txt
```
EST-001;JAVA-101;95
EST-001;WEB-201;88
EST-002;JAVA-101;92
EST-003;BD-301;85
```

**Formato**: `matricula;codigoCurso;calificacion`

## 🎨 Capturas de Pantalla

### Splash Screen
*Pantalla de bienvenida con logo institucional y timer de 3 segundos*

### Menú Principal
*Interfaz principal con acceso a los 4 módulos del sistema*

### Módulo de Cursos
*Formulario de registro de cursos con navegación entre registros*

### Módulo de Estudiantes
*Gestión completa de información de estudiantes*

### Módulo de Capacitaciones
*Asignación de estudiantes a cursos específicos*

### Módulo de Calificaciones
*Registro y consulta de calificaciones*

## 🔐 Validaciones y Reglas de Negocio

### Reglas Generales
1. **Códigos Únicos**: No se permiten duplicados de matrículas o códigos de curso
2. **Campos Obligatorios**: Todos los campos marcados como obligatorios deben completarse
3. **Integridad Referencial**: 
   - Para crear una capacitación, el estudiante y curso deben existir
   - Para crear una calificación, debe existir la inscripción
4. **Rangos Válidos**:
   - Horas de curso: > 0
   - Costo: ≥ 0
   - Calificaciones: 0-100

### Mensajes del Sistema
- ✅ "Registro guardado correctamente"
- ⚠️ "Todos los campos obligatorios deben llenarse"
- ❌ "El código ya existe"
- 🔍 "Está en el primer/último registro"
- ⁉️ "¿Eliminar este registro?"

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java SE 8+
- **GUI Framework**: Java Swing
- **IDE**: NetBeans (GUI Builder)
- **Persistencia**: File I/O (BufferedReader/BufferedWriter)
- **Arquitectura**: MVC simplificado

## 📊 Características Técnicas

### Manejo de Archivos
```java
// Lectura
try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
    String linea;
    while ((linea = br.readLine()) != null) {
        registros.add(linea.split(";", -1));
    }
}

// Escritura
try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
    bw.write(String.join(";", datos));
    bw.newLine();
}
```

### Navegación de Registros
```java
private void navegar(int direccion) {
    indiceActual += direccion;
    if (indiceActual < 0) {
        indiceActual = 0;
        JOptionPane.showMessageDialog(this, "Está en el primer registro.");
    } else if (indiceActual >= registros.size()) {
        indiceActual = registros.size() - 1;
        JOptionPane.showMessageDialog(this, "Está en el último registro.");
    }
    mostrarRegistro();
}
```

### Validación de Duplicados
```java
for (String[] r : registros) {
    if (r[0].equals(codigo)) {
        JOptionPane.showMessageDialog(this, "El código ya existe.");
        return;
    }
}
```

## 🚧 Roadmap

### Versión 1.0 (Actual)
- [x] CRUD completo para todos los módulos
- [x] Validaciones básicas
- [x] Persistencia en archivos TXT
- [x] Navegación entre registros
- [x] Splash Screen

### Versión 1.1 (Próximamente)
- [ ] Búsqueda de registros
- [ ] Filtros por nombre/código
- [ ] Ordenamiento de datos
- [ ] Exportación a CSV

### Versión 2.0 (Futuro)
- [ ] Base de datos MySQL/PostgreSQL
- [ ] Reportes en PDF
- [ ] Gráficas de estadísticas
- [ ] Sistema de usuarios y permisos
- [ ] Historial de cambios
- [ ] Backup automático
- [ ] Interfaz con JavaFX o web

### Mejoras Sugeridas
- [ ] Validación de formato de correo electrónico
- [ ] Validación de formato de teléfono
- [ ] Cálculo automático de promedios
- [ ] Dashboard con estadísticas
- [ ] Gestión de pagos
- [ ] Certificados digitales
- [ ] Asistencias
- [ ] Horarios de clases

## 🤝 Contribuir

Las contribuciones son bienvenidas. Para contribuir:

1. Fork el proyecto
2. Crea una rama (`git checkout -b feature/MejoraSistema`)
3. Commit tus cambios (`git commit -m 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/MejoraSistema`)
5. Abre un Pull Request

## 📝 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## 👨‍💻 Autor

**Tu Nombre** - *Desarrollo Completo* - [@tu-usuario](https://github.com/tu-usuario)

## 🎓 Propósito Académico

Este proyecto fue desarrollado como parte de un curso de programación orientada a objetos y demuestra:

- ✅ Manejo de interfaces gráficas con Swing
- ✅ Persistencia de datos con archivos
- ✅ Validación de entrada de usuario
- ✅ Navegación entre formularios
- ✅ Operaciones CRUD completas
- ✅ Manejo de excepciones
- ✅ Diseño de interfaz de usuario

## 📞 Soporte

Si encuentras algún problema o tienes sugerencias:
- 🐛 Abre un [Issue](https://github.com/tu-usuario/sistema-capacitacion/issues)
- 📧 Contacto: tu-email@ejemplo.com

---

⭐️ Si este proyecto te fue útil, considera darle una estrella en GitHub

**Sistema de Capacitación** - Gestión Académica con Java Swing
