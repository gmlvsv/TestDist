import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import structure.Airnb;
import structure.Crime;

public class TestDist {
    public final static String AIRNB_FILE_CSV = "./Airnb_Manhattan_2019_Filtered.csv";
    public final static String NYC_CRIME_CSV  = "./NYPD_Crime_Manhattan_2019_Filtered.csv";
    public static List<Airnb>  airnbList      = new ArrayList<>();
    public static List<Crime>  crimeList      = new ArrayList<>();

    /**
     * Calculate distance between points GEO
     *
     * @param lat1
     * @param lon1
     * @param lat2
     * @param lon2
     * @return
     */
    public static double distance(final float lat1, final float lon1, final float lat2,
            final float lon2) {
        final double p = 0.017453292519943295d;
        final double a = (0.5f - (Math.cos((lat2 - lat1) * p) / 2))
                + ((Math.cos(lat1 * p) * Math.cos(lat2 * p) * (1 - Math.cos((lon2 - lon1) * p)))
                        / 2);
        return 12742 * Math.sin(Math.sqrt(a));
    }

    public static void main(final String[] args) throws IOException, URISyntaxException {
        final long mStartTime = System.currentTimeMillis();
        try (Reader readerAirnb = Files.newBufferedReader(
                Paths.get(TestDist.class.getResource(TestDist.AIRNB_FILE_CSV).toURI()));
                Reader readerCrime = Files.newBufferedReader(
                        Paths.get(TestDist.class.getResource(TestDist.NYC_CRIME_CSV).toURI()));
                CSVParser csvParserAirnb = new CSVParser(readerAirnb, CSVFormat.DEFAULT);
                CSVParser csvParserCrime = new CSVParser(readerCrime, CSVFormat.DEFAULT);) {
            for (final CSVRecord csvRecord : csvParserAirnb) {
                if (csvRecord.getRecordNumber() == 1) {
                    continue;
                }
                final String id = csvRecord.get(0);
                final String name = csvRecord.get(1);
                final String last_review = csvRecord.get(2);
                final String neighbourhood_group_cleansed = csvRecord.get(3);
                final String neighbourhood_cleansed = csvRecord.get(4);
                final float review_scores_rating = new Float(csvRecord.get(5));
                final float review_scores_location = new Float(csvRecord.get(6));
                final float review_scores_value = new Float(csvRecord.get(7));
                final float latitude = new Float(csvRecord.get(8));
                final float longitude = new Float(csvRecord.get(9));
                final String property_type = csvRecord.get(10);
                final String room_type = csvRecord.get(11);
                final String accommodates = csvRecord.get(12);
                final int bathrooms = new Integer(csvRecord.get(13));
                final int bedrooms = new Integer(csvRecord.get(14));
                final String square_feet = csvRecord.get(15);
                final float price = new Float(csvRecord.get(16));
                final float security_deposit = new Float(csvRecord.get(17));
                final float cleaning_fee = new Float(csvRecord.get(18));
                final int guests_included = new Integer(csvRecord.get(19));
                final int minimum_nights = new Integer(csvRecord.get(20));
                final float number_of_reviews_ltm = new Float(csvRecord.get(21));
                final String last_review1 = csvRecord.get(22);
                final float reviews_per_month = new Float(csvRecord.get(23));
                final int number_of_reviews = new Integer(csvRecord.get(24));
                final int availability_365 = new Integer(csvRecord.get(25));
                final int crimes = new Integer(csvRecord.get(26));

                final Airnb a = new Airnb();
                a.setId(id);
                a.setName(name);
                a.setLast_review(last_review);
                a.setNeighbourhood_group_cleansed(neighbourhood_group_cleansed);
                a.setNeighbourhood_cleansed(neighbourhood_cleansed);
                a.setReview_scores_rating(review_scores_rating);
                a.setReview_scores_location(review_scores_location);
                a.setReview_scores_value(review_scores_value);
                a.setLatitude(latitude);
                a.setLongitude(longitude);
                a.setProperty_type(property_type);
                a.setRoom_type(room_type);
                a.setAccommodates(accommodates);
                a.setBathrooms(bathrooms);
                a.setBedrooms(bedrooms);
                a.setSquare_feet(square_feet);
                a.setPrice(price);
                a.setSecurity_deposit(security_deposit);
                a.setCleaning_fee(cleaning_fee);
                a.setGuests_included(guests_included);
                a.setMinimum_nights(minimum_nights);
                a.setNumber_of_reviews_ltm(number_of_reviews_ltm);
                a.setLast_review1(last_review1);
                a.setReviews_per_month(reviews_per_month);
                a.setNumber_of_reviews(number_of_reviews);
                a.setAvailability_365(availability_365);
                a.setCrimes(crimes);
                TestDist.airnbList.add(a);
            }

            {
                for (final CSVRecord csvRecord : csvParserCrime) {
                    if (csvRecord.getRecordNumber() == 1) {
                        continue;
                    }

                    final String CMPLNT_NUM = csvRecord.get(0);
                    final String ADDR_PCT_CD = csvRecord.get(1);
                    final String BORO_NM = csvRecord.get(2);
                    final String CMPLNT_FR_DT = csvRecord.get(3);
                    final String CMPLNT_FR_TM = csvRecord.get(4);
                    final String CMPLNT_TO_DT = csvRecord.get(5);
                    final String CMPLNT_TO_TM = csvRecord.get(6);
                    final String CRM_ATPT_CPTD_CD = csvRecord.get(7);
                    final String HADEVELOPT = csvRecord.get(8);
                    final String HOUSING_PSA = csvRecord.get(9);
                    final String JURISDICTION_CODE = csvRecord.get(10);
                    final String JURIS_DESC = csvRecord.get(11);
                    final String KY_CD = csvRecord.get(12);
                    final String LAW_CAT_CD = csvRecord.get(13);
                    final String LOC_OF_OCCUR_DESC = csvRecord.get(14);
                    final String OFNS_DESC = csvRecord.get(15);
                    final String PARKS_NM = csvRecord.get(16);
                    final String PATROL_BORO = csvRecord.get(17);
                    final String PD_CD = csvRecord.get(18);
                    final String PD_DESC = csvRecord.get(19);
                    final String PREM_TYP_DESC = csvRecord.get(20);
                    final String RPT_DT = csvRecord.get(21);
                    final String STATION_NAME = csvRecord.get(22);
                    final String SUSP_AGE_GROUP = csvRecord.get(23);
                    final String SUSP_RACE = csvRecord.get(24);
                    final String SUSP_SEX = csvRecord.get(25);
                    final String TRANSIT_DISTRICT = csvRecord.get(26);
                    final String VIC_AGE_GROUP = csvRecord.get(27);
                    final String VIC_RACE = csvRecord.get(28);
                    final String VIC_SEX = csvRecord.get(29);
                    final String X_COORD_CD = csvRecord.get(30);
                    final String Y_COORD_CD = csvRecord.get(31);
                    final float Latitude = new Float(csvRecord.get(32));
                    final float Longitude = new Float(csvRecord.get(33));
                    final String Lat_Lon = csvRecord.get(34);

                    final Crime a = new Crime();
                    a.setCMPLNT_NUM(CMPLNT_NUM);
                    a.setADDR_PCT_CD(ADDR_PCT_CD);
                    a.setBORO_NM(BORO_NM);
                    a.setCMPLNT_FR_DT(CMPLNT_FR_DT);
                    a.setCMPLNT_FR_TM(CMPLNT_FR_TM);
                    a.setCMPLNT_TO_DT(CMPLNT_TO_DT);
                    a.setCMPLNT_TO_TM(CMPLNT_TO_TM);
                    a.setCRM_ATPT_CPTD_CD(CRM_ATPT_CPTD_CD);
                    a.setHADEVELOPT(HADEVELOPT);
                    a.setHOUSING_PSA(HOUSING_PSA);
                    a.setJURISDICTION_CODE(JURISDICTION_CODE);
                    a.setJURIS_DESC(JURIS_DESC);
                    a.setKY_CD(KY_CD);
                    a.setLAW_CAT_CD(LAW_CAT_CD);
                    a.setLOC_OF_OCCUR_DESC(LOC_OF_OCCUR_DESC);
                    a.setOFNS_DESC(OFNS_DESC);
                    a.setPARKS_NM(PARKS_NM);
                    a.setPATROL_BORO(PATROL_BORO);
                    a.setPD_CD(PD_CD);
                    a.setPD_DESC(PD_DESC);
                    a.setPREM_TYP_DESC(PREM_TYP_DESC);
                    a.setRPT_DT(RPT_DT);
                    a.setSTATION_NAME(STATION_NAME);
                    a.setSUSP_AGE_GROUP(SUSP_AGE_GROUP);
                    a.setSUSP_RACE(SUSP_RACE);
                    a.setSUSP_SEX(SUSP_SEX);
                    a.setTRANSIT_DISTRICT(TRANSIT_DISTRICT);
                    a.setVIC_AGE_GROUP(VIC_AGE_GROUP);
                    a.setVIC_RACE(VIC_RACE);
                    a.setVIC_SEX(VIC_SEX);
                    a.setX_COORD_CD(X_COORD_CD);
                    a.setY_COORD_CD(Y_COORD_CD);
                    a.setLatitude(Latitude);
                    a.setLongitude(Longitude);
                    a.setLat_Lon(Lat_Lon);
                    TestDist.crimeList.add(a);
                }

            }
            System.out.println("Airnb list size = " + TestDist.airnbList.size());
            System.out.println("Crime list size = " + TestDist.crimeList.size());
            for (final Airnb a : TestDist.airnbList) {
                for (final Crime c : TestDist.crimeList) {
                    final double d = TestDist.distance(a.getLatitude(), a.getLongitude(),
                            c.getLatitude(), c.getLongitude());
                    if (d <= 0.1) {
                        a.setCrimes(a.getCrimes() + 1);
                    }
                }
            }
            System.out.println("Saving file..");
            TestDist.saveCSV(TestDist.airnbList, "Airnb_Manhattan_Crimes_2019.csv");
            final long currtime = System.currentTimeMillis();
            final long elapsedTime = currtime - mStartTime;
            System.out.println("Total Time Elapsed: " + String.format("%02d:%02d:%02d",
                    TimeUnit.MILLISECONDS.toHours(elapsedTime),
                    TimeUnit.MILLISECONDS.toMinutes(elapsedTime)
                            - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(elapsedTime)), // The
                                                                                                    // change
                                                                                                    // is
                                                                                                    // in
                                                                                                    // this
                                                                                                    // line
                    TimeUnit.MILLISECONDS.toSeconds(elapsedTime) - TimeUnit.MINUTES
                            .toSeconds(TimeUnit.MILLISECONDS.toMinutes(elapsedTime))));
            System.out.println(
                    "================================== END ==========================================");

        }

    }

    public static void saveCSV(final List<Airnb> al, final String filename) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("id",
                        "name", "last_review", "neighbourhood_group_cleansed",
                        "neighbourhood_cleansed", "review_scores_rating", "review_scores_location",
                        "review_scores_value", "latitude", "longitude", "property_type",
                        "room_type", "accommodates", "bathrooms", "bedrooms", "square_feet",
                        "price", "security_deposit", "cleaning_fee", "guests_included",
                        "minimum_nights", "number_of_reviews_ltm", "last_review",
                        "reviews_per_month", "number_of_reviews", "availability_365", "crimes"));) {
            for (final Airnb a : al) {
                csvPrinter.printRecord(a.getId(), a.getName(), a.getLast_review(),
                        a.getNeighbourhood_group_cleansed(), a.getNeighbourhood_cleansed(),
                        a.getReview_scores_rating(), a.getReview_scores_location(),
                        a.getReview_scores_value(), a.getLatitude(), a.getLongitude(),
                        a.getProperty_type(), a.getRoom_type(), a.getAccommodates(),
                        a.getBathrooms(), a.getBedrooms(), a.getSquare_feet(), a.getPrice(),
                        a.getSecurity_deposit(), a.getCleaning_fee(), a.getGuests_included(),
                        a.getMinimum_nights(), a.getNumber_of_reviews_ltm(), a.getLast_review1(),
                        a.getReviews_per_month(), a.getNumber_of_reviews(), a.getAvailability_365(),
                        a.getCrimes());
                csvPrinter.flush();
            }

        }
    }
}
