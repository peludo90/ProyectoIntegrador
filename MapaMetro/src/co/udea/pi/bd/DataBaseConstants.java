package co.udea.pi.bd;

public class DataBaseConstants {

		public static final String TABLE_LINE = "line";
		public static final String TABLE_STATION = "station";
		public static final String TABLA_ROUTE = "route";
		public static final String TABLE_LINEXSTATION = "linexstation";
		public static final String TABLE_TYPE = "transport_type";
		
		public static final String[] CAMPOS_LINE = new String[] { "id_line", "name", "id_type" };
		public static final String[] CAMPOS_STATION = new String[] { "id_station", "name", "latitude", "longitude" };
		public static final String[] CAMPOS_ROUTE = new String[] { "id_route", "name" };
		public static final String[] CAMPOS_LINEXSTATION = new String[] { "id_lxs", "id_line", "id_station", "station_number"};
		public static final String[] CAMPOS_TYPE = new String[] { "id_type", "name" };

}
