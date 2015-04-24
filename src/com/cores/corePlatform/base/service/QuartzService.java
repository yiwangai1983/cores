package com.cores.corePlatform.base.service;

/**
 * 批处理调度接口
 * Created by super on 2015/4/24.
 */
public interface QuartzService {

    /**
     * 初始化quartz调度任务
     * @throws Exception
     */
    public void initScheduler() throws Exception;

    public void reScheduler() throws Exception;

    /**
     * 取批处理任务
     * @return
     */
//	public List<EbizBatchInfo> getBatchInfoList(EbizBatchInfo batchInfo) throws Exception;;

}
