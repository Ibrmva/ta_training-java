package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.models;

import java.util.Objects;

import static com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.util.StringUtils.containsSubstring;

public class CloudEngine {

    private String numberOfInstances;
    private String operatingSystem;
    private String provisioningModel;
    private String machineFamily;
    private String series;
    private String machineType;
    private String GPUtype;
    private String numberOfGPUs;
    private String localSSD;
    private String region;
    private String commitedUsage;

    public CloudEngine(
            String numberOfInstances,
            String operatingSystem,
            String provisioningModel,
            String machineFamily,
            String series,
            String machineType,
            String GPUtype,
            String numberOfGPUs,
            String localSSD,
            String region,
            String commitedUsage
    ) {
        this.numberOfInstances = numberOfInstances;
        this.operatingSystem = operatingSystem;
        this.provisioningModel = provisioningModel;
        this.machineFamily = machineFamily;
        this.series = series;
        this.machineType = machineType;
        this.GPUtype = GPUtype;
        this.numberOfGPUs = numberOfGPUs;
        this.localSSD = localSSD;
        this.region = region;
        this.commitedUsage = commitedUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CloudEngine)) return false;
        CloudEngine other = (CloudEngine) o;

        if (
                !Objects.equals(getNumberOfInstances(), other.getNumberOfInstances()) ||
                        !Objects.equals(getOperatingSystem(), other.getOperatingSystem()) ||
                        !Objects.equals(getProvisioningModel(), other.getProvisioningModel()) ||
                        !containsSubstring(getMachineType(), other.getMachineType()) ||
                        !Objects.equals(getGPUtype(), other.getGPUtype()) ||
                        !Objects.equals(getNumberOfGPUs(), other.getNumberOfGPUs()) ||
                        !Objects.equals(getLocalSSD(), other.getLocalSSD()) ||
                        !Objects.equals(getRegion(), other.getRegion()) ||
                        !Objects.equals(getCommitedUsage(), other.getCommitedUsage())
        ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CloudEngine " +
                "{ numberOfInstances='" + numberOfInstances + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", provisioningModel='" + provisioningModel + '\'' +
                ", machineFamily='" + machineFamily + '\'' +
                ", series='" + series + '\'' +
                ", machineType='" + machineType + '\'' +
                ", GPUtype='" + GPUtype + '\'' +
                ", numberOfGPUs='" + numberOfGPUs + '\'' +
                ", localSSD='" + localSSD + '\'' +
                ", region='" + region + '\'' +
                ", commitedUsage='" + commitedUsage + '\'' +
                '}';
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getProvisioningModel() {
        return provisioningModel;
    }

    public String getMachineFamily() {
        return machineFamily;
    }

    public String getSeries() {
        return series;
    }

    public String getMachineType() {
        return machineType;
    }

    public String getGPUtype() { return GPUtype; }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getRegion() {
        return region;
    }

    public String getCommitedUsage() {
        return commitedUsage;
    }
}

