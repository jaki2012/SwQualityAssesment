package com.tongji409.domain;

import java.util.Date;

/**
 * Created by lijiechu on 16/11/14.
 */
public class Task {

    private Integer taskID;

    private Integer userID;

    private String projectName;

    private String projectVersion;
    //作业开始时间
    private Date startTime;
    //作业结束时间
    private Date endTime;
    //代码托管的路径
    private String path;
    //代码源文件下载的路径
    private String archivePath;

    private Integer taskState;

    private String taskStateDesc;

    private String sonarqubeUrl;

    public String getArchivePath() {
        return archivePath;
    }

    public void setArchivePath(String archivePath) {
        this.archivePath = archivePath;
    }

    public void setTaskID(Integer taskID) {
        this.taskID = taskID;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public String getTaskStateDesc() {
        return taskStateDesc;
    }

    public void setTaskStateDesc(String taskStateDesc) {
        this.taskStateDesc = taskStateDesc;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getSonarqubeUrl() {
        return sonarqubeUrl;
    }

    public void setSonarqubeUrl(String sonarqubeUrl) {
        this.sonarqubeUrl = sonarqubeUrl;
    }
}
