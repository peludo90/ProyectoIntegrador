package co.udea.pi.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class BDSQlite extends SQLiteOpenHelper {

	String sqlCreateLine = "CREATE TABLE line(id_line INTEGER, name TEXT, short_name TEXT, id_type INTEGER)";
	String sqlCreateStation = "CREATE TABLE station( id_station INTEGER, name TEXT, latitude TEXT, longitude TEXT)";
	String sqlCreateRoute = "CREATE TABLE route(id_route INTEGER, name TEXT)";
	String sqlCreateLineXStation = "CREATE TABLE linexstation(id_lxs INTEGER, id_line INTEGER, id_station INTEGER, station_number INTEGER)";
	String sqlCreateType = "CREATE TABLE transpor_type(id_type INTEGER, name TEXT)";

	/**
	 * este constructor normalmente no se toca, a no ser que ud desea implementar algo distinto a lo que se necesita por
	 * defecto
	 * 
	 * @param context
	 * @param name
	 * @param factory
	 * @param version
	 */
	public BDSQlite(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	/**
	 * en este metodo es donde ejecutamos las sentencias SQL para la creacion de las tablas de la DB
	 */
	@Override
	public void onCreate(SQLiteDatabase sqliteDb) {

		sqliteDb.execSQL(sqlCreateLine);
		sqliteDb.execSQL(sqlCreateStation);
		sqliteDb.execSQL(sqlCreateRoute);
		sqliteDb.execSQL(sqlCreateLineXStation);
		sqliteDb.execSQL(sqlCreateType);

		sqliteDb.execSQL("INSERT INTO transpor_type(id_type, name) VALUES (1,'Metro')");
		sqliteDb.execSQL("INSERT INTO transpor_type(id_type, name) VALUES (2,'Metrocable')");
		sqliteDb.execSQL("INSERT INTO transpor_type(id_type, name) VALUES (3,'Metroplus')");
		sqliteDb.execSQL("INSERT INTO transpor_type(id_type, name) VALUES (4,'Ruta Integrada')");
		sqliteDb.execSQL("INSERT INTO transpor_type(id_type, name) VALUES (5,'Alimentador')");
		sqliteDb.execSQL("INSERT INTO transpor_type(id_type, name) VALUES (6,'EnCicla')");
		sqliteDb.execSQL("INSERT INTO transpor_type(id_type, name) VALUES (7,'Tranvía')");
		
		
		sqliteDb.execSQL("INSERT INTO line (id_line, name, short_name, id_type) VALUES (1,'Linea A','A', 1)");
		sqliteDb.execSQL("INSERT INTO line (id_line, name, short_name, id_type) VALUES (1,'Linea B','B', 1)");
		sqliteDb.execSQL("INSERT INTO line (id_line, name, short_name, id_type) VALUES (1,'Linea J','J', 2)");
		sqliteDb.execSQL("INSERT INTO line (id_line, name, short_name, id_type) VALUES (1,'Linea K','K', 2)");
		sqliteDb.execSQL("INSERT INTO line (id_line, name, short_name, id_type) VALUES (1,'Linea L','L', 2)");
		sqliteDb.execSQL("INSERT INTO line (id_line, name, short_name, id_type) VALUES (1,'Linea 1','1', 3)");
		sqliteDb.execSQL("INSERT INTO line (id_line, name, short_name, id_type) VALUES (1,'Linea 2','2', 3)");

		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (1,'Niquía', '6.338039', '-75.544245')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (2,'Bello', '6.327887', '-75.553729')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (3,'Madera', '6.316050', '-75.555295')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (4,'Acevedo', '6.299669', '-75.558658')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (5,'Tricentenario', '6.289678', '-75.565273')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (6,'Caribe', '6.278235', '-75.569481')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (7,'Universidad', '6.269373', '-75.565982')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (8,'Hospital', '6.263910', '-75.563359')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (9,'Prado', '6.257055', '-75.566111')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (10,'Parque Berrío', '6.250347', '-75.568396')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (11,'San Antonio', '6.247102', '-75.569763')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (12,'Alpujarra', '6.242909', '-75.571413')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (13,'Exposiciones', '6.238183', '-75.573199')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (14,'Industriales', '6.230216', '-75.575565')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (15,'Poblado', '6.212367', '-75.578043')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (16,'Aguacatala', '6.193605', '-75.581997')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (17,'Ayurá', '6.186330', '-75.585752')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (18,'Envigado', '6.174607', '-75.596614')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (19,'Itaguí', '6.162914', '-75.606683')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (20,'Sabaneta', '6.157190', '-75.616394')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (21,'La Estrella', '6.152829', '-75.625837')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (22,'Cisneros', '6.249012', '-75.575180')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (23,'Suramericana', '6.252950', '-75.582961')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (24,'Estadio', '6.253297', '-75.588242')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (25,'Floresta', '6.253297', '-75.588242')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (26,'Santa Lucía', '6.257966', '-75.603762')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (27,'San Javier', '6.256803', '-75.613718')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (28,'Andalucía', '6.296230', '-75.551902')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (29,'Popular', '6.295147', '-75.548206')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (30,'Santo Domingo', '6.293174', '-75.541716')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (31,'Juan XXIII', '6.265694', '-75.613684')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (32,'Vallejuelos', '6.275361', '-75.614036')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (33,'La Aurora', '6.281253', '-75.613972')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (34,'Arví', '6.280546', '-75.502614')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (35,'U.de M.', '6.230998', '-75.609643')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (36,'Los Alpes', '6.231049', '-75.605480')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (37,'La Palma', '6.231141', '-75.601344')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (38,'Parque Belén', '6.231388', '-75.596481')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (39,'Rosales', '6.231564', '-75.591301')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (40,'Fátima', '6.231680', '-75.586921')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (41,'Nutibara', '6.231807', '-75.582388')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (42,'Industriales', '6.230817', '-75.576113')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (43,'Plaza Mayor', '6.243165', '-75.575383')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (44,'Cisneros', '6.250473', '-75.575114')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (45,'Minorista', '6.256073', '-75.573243')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (46,'Chagualo', '6.260957', '-75.569063')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (47,'UdeA', '6.264207', '-75.567584')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (48,'San Pedro', '6.263469', '-75.559902')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (49,'Palos Verdes', '6.262407', '-75.555734')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (50,'Gardel', '6.268100', '-75.555041')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (51,'Manrique', '6.272945', '-75.554171')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (52,'Las Esmeraldas', '6.278624', '-75.553186')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (53,'Berlín', '6.283394', '-75.552891')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (54,'Parque de Aranjuez', '6.284976', '-75.556705')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (55,'Barrio Colombia', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (56,'Barrio San Diego', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (57,'Barrio Colón', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (58,'San José', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (59,'La Playa', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (60,'Catedral Metropolitana', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (61,'Prado', '6.256937', '-75.566684')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (62,'', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (63,'', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (64,'', '')");
		sqliteDb.execSQL("INSERT INTO station (id_station, name, latitude, longitude) VALUES (65,'', '')");

	
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,2,2)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,3,3)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,4,4)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,5,5)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,6,6)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,7,7)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,8,8)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");
		sqliteDb.execSQL("INSERT INTO linexstation (id_lxs, id_line, id_station, station_number) VALUES (1,1,1,1)");


	}

	@Override
	public void onUpgrade(SQLiteDatabase sqliteDb, int versionAntigua, int versionNueva) {
		 /* sqliteDb.execSQL("DROP TABLE IF EXISTS EQUIPO");
		  sqliteDb.execSQL("DROP TABLE IF EXISTS POSICION");
		  sqliteDb.execSQL("DROP TABLE IF EXISTS HABILIDAD");
		  sqliteDb.execSQL("DROP TABLE IF EXISTS JUGADOR");
		  sqliteDb.execSQL("DROP TABLE IF EXISTS HABILIDADESJUGADOR");
		  sqliteDb.execSQL("DROP TABLE IF EXISTS TRANSFERENCIA");
		  
		  onCreate(sqliteDb);*/
		
	}

}
