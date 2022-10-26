package src.storage_systems;

import java.io.File;

import src.CreateSQLiteDatabase;

/**
 * Testing how fast it is to read data that was written directly with
 * FileOutputStream.
 * Technically would be faster as the files will only be storing the raw byte
 * data of the waveform itself - however, it could be more useful to have a
 * SQLite database, where you can quickly get a specific time of recording.
 * 
 * 
 * There would be a lot of blobs to read through, these blobs are the waveform data itself.
 * 
 * blocks of data in one file
 */
public class FileOutputStreamStorage implements IStorageSystem {

    private String speedsURL;

    FileOutputStreamStorage() {
        speedsURL = "jdbc:sqlite:speedsOfSQLDatabase.db";
        File script = new File("scripts/databaseAnalysis.txt");
        new CreateSQLiteDatabase("speedsOfSQLDatabase", script);


        
    }

    @Override
    public void prepareStorage() {
        // TODO Auto-generated method stub

        /**
         * Seeing how fast it is to read data from different files to get different
         * times.
         */

    }

    @Override
    public void store(byte[] data) {
        // TODO Auto-generated method stub

    }

    @Override
    public void closeStorage() {
        // TODO Auto-generated method stub

    }

    @Override
    public void reportAnalysis() {
        // TODO Auto-generated method stub

    }

}
