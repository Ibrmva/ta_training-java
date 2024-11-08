package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.util;

import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.models.CloudEngine;

public class CloudEngineBuilder {
    private static final String TESTDATA_CLOUD_ENGINE_NUMBER_OF_INSTANCES = "testdata.cloudEngine.numberOfInstances";
    private static final String TESTDATA_CLOUD_ENGINE_OPERATING_SYSTEM = "testdata.cloudEngine.operatingSystem";
    private static final String TESTDATA_CLOUD_ENGINE_PROVISIONING_MODEL = "testdata.cloudEngine.provisioningModel";
    private static final String TESTDATA_CLOUD_ENGINE_MACHINE_FAMILY = "testdata.cloudEngine.machineFamily";
    private static final String TESTDATA_CLOUD_ENGINE_SERIES = "testdata.cloudEngine.series";
    private static final String TESTDATA_CLOUD_ENGINE_MACHINE_TYPE = "testdata.cloudEngine.machineType";
    private static final String TESTDATA_CLOUD_ENGINE_GPU_TYPE = "testdata.cloudEngine.GPUtype";
    private static final String TESTDATA_CLOUD_ENGINE_NUMBER_OF_GPUS = "testdata.cloudEngine.numberOfGPUs";
    private static final String TESTDATA_CLOUD_ENGINE_LOCAL_SSD = "testdata.cloudEngine.localSSD";
    private static final String TESTDATA_CLOUD_ENGINE_REGION = "testdata.cloudEngine.region";
    private static final String TESTDATA_CLOUD_ENGINE_COMMITED_USAGE = "testdata.cloudEngine.commitedUsage";

    public static CloudEngine fromProperties(){
        return new CloudEngine(
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_OPERATING_SYSTEM),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_PROVISIONING_MODEL),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_MACHINE_FAMILY),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_SERIES),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_NUMBER_OF_GPUS),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_LOCAL_SSD),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_REGION),
                TestDataReader.getTestData(TESTDATA_CLOUD_ENGINE_COMMITED_USAGE));
    }
}

