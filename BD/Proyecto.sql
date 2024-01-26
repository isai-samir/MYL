create database MYL;

use MYL;

Create table Clientes ( 
   	id int not null identity(1,1) primary key, 
   	nombre    varchar(30), 
    telefono   varchar(10), 
    municipio   varchar(30),
	colonia varchar(30),
	calle varchar(30),
	numeroCalle int,
    credito float,
    maxCredito float
); 

Create table Empleados ( 
   	id int not null identity(1,1) primary key, 
   	nombre varchar(30), 
    contraseña varchar(4), 
    nivel int
); 

Create table Proveedores ( 
   	id int not null identity(1,1) primary key, 
   	direccion varchar(30), 
    telefono varchar(10), 
); 

Create table Departamentos ( 
   	id int not null identity(1,1) primary key, 
   	nombre varchar(30)
); 

Create table Productos ( 
   	id int not null identity(1,1) primary key, 
   	codigoBarras varchar(10),
    descripcion varchar(30),
    proveedor int Foreign key (proveedor) references Proveedores(id),
    departamento int Foreign key (departamento) references Departamentos(id),
    unidad varchar(10),
    costo float,
    utilidadMenudeo float,
    utilidadMayoreo float,
    existencias int
); 

Create table VentasMenudeo ( 
   	id int not null identity(1,1) primary key, 
   	vendedor int Foreign key (vendedor) references Empleados(id),
    fecha date,
    totalPagar float,
    ganancia float
); 

Create table VentasMayoreo ( 
   	id int not null identity(1,1) primary key, 
   	vendedor int Foreign key (vendedor) references Empleados(id),
    cliente int Foreign key (cliente) references Clientes(id),
    fecha date,
    totalPagar float,
    ganancia float
); 

Create table VentasDescripcionMay(
    producto int Foreign key (producto) references Productos(id),
    idVenta int Foreign key (idVenta) references ventasMayoreo(id),
    cantidad float,
    descuento float
);

Create table VentasDescripcionMen(
    producto int Foreign key (producto) references Productos(id),
    idVenta int Foreign key (idVenta) references ventasMenudeo(id),
    cantidad float,
);

Create table Abonos(
    id int not null identity(1,1) primary key,
    cliente int Foreign key references Clientes(id),
    abono float,
    adeudo float,
    fecha date
);

