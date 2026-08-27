qsb@cmpmtxn72:~$ ps -ef | grep -i java
  wacgov 27612     1   0   Aug 04 ?         477:18 java -Xms64m -Xmx1024m wac.framework.Workaholic start BalanceFromCore_Gov
  waccmp   267     1   0 11:40:01 ?          81:29 java -jar -Dspring.profiles.active=prod /opt/sbi/wac/integration/cmp_corp_onboarding_intg.jar
  waccmp 29155     1   0   Aug 04 ?        2661:45 java -Xms6144m -Xmx8192m wac.framework.Workaholic start file_processor_huge
  wacgov 28237     1   0   Aug 04 ?        1233:03 java -Xms6144m -Xmx8192m wac.framework.Workaholic start TransactionPosting_Gov
  waccmp 26281     1   0   Aug 04 ?        1867:05 java -Xms6144m -Xmx8192m wac.framework.Workaholic start impstransactionposting
  waccmp  1828     1   0   Aug 13 ?         101:36 java -jar -Dspring.profiles.active=prod /opt/sbi/wac/lib/appjars/cmp_H2H_intg_sftp-0.0.1-SNAPSHOT.jar
  waccmp 28474     1   0   Aug 04 ?         601:00 java -Xms256m -Xmx512m wac.framework.Workaholic start eodmisecollgen
  waccmp 27032     1   0   Aug 04 ?         496:20 java -Xms6144m -Xmx8192m wac.framework.Workaholic start bulktaxpayment
CENTRALGOV 13932     1  0   Aug 05 ?       1328:16 java -Xms2048m -Xmx3072m wac.framework.Workaholic start TransactionPosting_Gov_Central
  waccmp 25864     1   0   Aug 04 ?         751:17 java -Xms6144m -Xmx8192m wac.framework.Workaholic start epfosftp
  wacgov 27142     1   0   Aug 04 ?         518:27 java -Xms6144m -Xmx8192m wac.framework.Workaholic start Gov_File_Parser_Jharkand
     qsb 11704     1   0 07:00:12 ?          25:11 java -Xms64m -Xmx3072m StartSpringBatchScheduler collectionprocessor
  wacgov 28795     1   0   Aug 04 ?         616:25 java -Xms64m -Xmx1024m wac.framework.Workaholic start E9_Emro_Validator
  waccmp 27116     1   0   Aug 04 ?        5388:32 java -Xms6144m -Xmx8192m wac.framework.Workaholic start upitransactionposting
  waccmp 29308     1   0   Aug 04 ?        1503:52 java -Xms6144m -Xmx8192m wac.framework.Workaholic start paymentadvice
  waccmp  2852     1   0   Aug 11 ?          32:55 java -jar -Dspring.profiles.active=prod-pr /opt/sbi/wac/integration/RealTimeAPITxnEnquiry.jar
  waccmp  6123     1   0   Aug 05 ?         687:10 /opt/sbi/wac/JAVA/jdk1.8.0_bkp_16062026/jre/bin/java -Xms6144m -Xmx8192m wac.framework.Workaholic start PRMProcessor
  waccmp 29487     1   0   Aug 04 ?        2014:21 java -Xms512m -Xmx1024m wac.framework.Workaholic start paymentAdviceEmail
  waccmp 28652     1   0   Aug 04 ?         559:26 java -Xms64m -Xmx3072m wac.framework.Workaholic start TransactionCreation
  waccmp 27149     1   0   Aug 04 ?         635:07 java -Xms6144m -Xmx8192m wac.framework.Workaholic start cmpsftpxml
  waccmp 26962     1   0   Aug 04 ?        1507:30 java -Xms512m -Xmx1024m wac.framework.Workaholic start eodmisecoll
  wacgov 27516     1   0   Aug 04 ?         454:59 java -Xms64m -Xmx1024m wac.framework.Workaholic start MRPortRePostTxn_Gov
  wacgov   691     1   0   Aug 11 ?         191:46 java -jar -Dspring.profiles.active=prod /opt/sbi/wac_gov/integration/cmp_e9_intg.jar
  wacgov 28578     1   0   Aug 04 ?         751:07 java -Xms6144m -Xmx8192m wac.framework.Workaholic start Central_File_Parser
  waccmp  8343     1   0   Aug 05 ?         593:50 java -Djdk.tls.client.protocols=TLSv1.2 -Xms512m -Xmx1024m wac.framework.Workaholic start customerenquiry
  waccmp 13824     1   1   Aug 05 ?       34084:37 /opt/sbi/wac/JAVA/jdk1.8.0_bkp_16062026/jre/bin/java -jar -Dspring.profiles.active=prod /opt/sbi/wac/PRM/PRMSchedular.jar
  waccmp 29551     1   0   Aug 04 ?         671:33 java -Xms512m -Xmx1024m wac.framework.Workaholic start paymentadvice_medium
     qsb  8832  8618   0 02:00:01 ?         131:06 /usr/jdk/instances/jdk1.8.0/jre/bin/java -Xms64m -Xmx3072m -jar /opt/sbi/qsb/Mandate/mandate_shedular.jar 37
  waccmp 27889     1   0   Aug 04 ?        1280:58 java -Xms256m -Xmx512m wac.framework.Workaholic start reptxnposting
  wacgov 28737     1   0   Aug 04 ?        1106:52 java -Xms64m -Xmx3072m wac.framework.Workaholic start gov_multipart_sftp
  wacgov 27384     1   0   Aug 04 ?         461:41 java -Xms64m -Xmx1024m wac.framework.Workaholic start MRPortTxnEnquiry_Gov
  wacgov 26427     1   0   Aug 04 ?         858:36 java -Xms6144m -Xmx8192m wac.framework.Workaholic start TransactionCreation_gov
  waccmp 27243     1   0   Aug 04 ?         465:36 java -Xms256m -Xmx512m wac.framework.Workaholic start MRPortTxnEnquiry
  wacgov 26153     1   0   Aug 04 ?         604:47 java -Xms64m -Xmx512m wac.framework.Workaholic start gov_auth_processor
  wacgov 27272     1   0   Aug 04 ?         500:19 java -Xms64m -Xmx1024m wac.framework.Workaholic start MRPortTxnPosting_Gov
CENTRALGOV 12273     1  0   Aug 05 ?       2037:10 java -Xms2048m -Xmx3072m wac.framework.Workaholic start file_processor_gov_Central
  waccmp 29277     1   0   Aug 04 ?       15410:34 java -Xms6144m -Xmx8192m wac.framework.Workaholic start file_processor_medium
  waccmp 29850     1   0   Aug 04 ?         556:23 java -Xms64m -Xmx3072m com.sbi.gateway.creator.GatewayStarter start CORPserver6799
CENTRALGOV 16939     1  0 12:35:04 ?        513:18 java -Xms6144m -Xmx8192m wac.framework.Workaholic start ITRO_PRAKLP_FASTPLUS
  waccmp 29040     1   0   Aug 04 ?         587:04 java -Xms64m -Xmx3072m wac.framework.Workaholic start DDRPosting
  wacgov 28321     1   0   Aug 04 ?         583:27 java -Xms6144m -Xmx8192m wac.framework.Workaholic start Gov_File_Parser
  waccmp 26966     1   0 05:31:06 ?           4:14 java -Xms6144m -Xmx8192m wac.framework.Workaholic start mandate_pgp_enc_dec
  waccmp  9250     1   0   Aug 04 ?          71:05 java -jar /opt/sbi/wac/collections/CCPCSchedular.jar
     qsb 25829 25789   0 23:00:01 ?         155:38 /usr/jdk/instances/jdk1.8.0/jre/bin/java -Xms64m -Xmx3072m -jar /opt/sbi/qsb/Mandate/mandate_shedular.jar 37
  wacgov 28400     1   0   Aug 04 ?        1777:45 java -Xms6144m -Xmx8192m wac.framework.Workaholic start scrollsftp
CENTRALGOV 13580     1  0   Aug 10 ?        438:07 java -Xms2048m -Xmx3072m wac.framework.Workaholic start MRPortTxnEnquiry_Gov_Central
  waccmp 27183     1   0   Aug 04 ?         481:51 java -Xms6144m -Xmx8192m wac.framework.Workaholic start nachtxnposting
CENTRALGOV 13232     1  0   Aug 05 ?        644:31 java -Xms2048m -Xmx3072m wac.framework.Workaholic start MRPortTxnPosting_Gov_Central
  wacgov 18444     1   0   Aug 05 ?          39:24 java -jar -Dspring.profiles.active=prod /opt/sbi/wac_gov/integration/cmp_sgc_intg.jar
  wacgov 27018     1   0   Aug 04 ?         539:03 java -Xms64m -Xmx512m wac.framework.Workaholic start TransactionEnquiry_gov
     qsb 25299     1   0   Aug 04 ?         370:42 java -Xms64m -Xmx3072m StartSpringBatchScheduler smsmandates
  waccmp 26924     1   0   Aug 04 ?         498:19 java -Xms256m -Xmx512m wac.framework.Workaholic start TxnEnquiryPosting_Premium
  wacgov 26560     1   0   Aug 04 ?         453:15 java -Xms6144m -Xmx8192m wac.framework.Workaholic start nefttxnposting_gov
  waccmp 29884     1   0   Aug 04 ?         576:45 java -Xms64m -Xmx3072m com.sbi.gateway.creator.GatewayStarter start GOVTserver6800
  waccmp 27995     1   0   Aug 04 ?         524:50 java -Xms256m -Xmx512m wac.framework.Workaholic start mqmis
  wacgov 24593     1   0   Aug 10 ?        1596:29 java -Xms6144m -Xmx8192m wac.framework.Workaholic start govsftp
  waccmp 22795     1   0   Aug 24 ?         103:37 java -Xms6144m -Xmx8192m wac.framework.Workaholic start corp_reversefile
  wacgov 27735     1   0   Aug 04 ?         552:06 java -Xms6144m -Xmx8192m wac.framework.Workaholic start TrickleFeedNEFT_Gov
     qsb 25968     1   0   Aug 04 ?         473:29 java -jar pdfsign.jar
  wacgov 26789     1   0   Aug 04 ?         569:21 java -Xms64m -Xmx512m wac.framework.Workaholic start triggerSms
  waccmp 29704     1   0   Aug 04 ?         868:14 java -Xms512m -Xmx1024m wac.framework.Workaholic start paymentAdviceEmail_medium
  waccmp 28867     1   0   Aug 04 ?         553:11 java -Xms64m -Xmx3072m wac.framework.Workaholic start paymentadvice_bulk
  waccmp  4538     1   0   Aug 24 ?          69:06 java -Xms256m -Xmx512m wac.framework.Workaholic start nefttxnposting_premium
  waccmp 28703     1   0   Aug 04 ?         594:46 java -Xms512m -Xmx1024m wac.framework.Workaholic start overseascollection
  waccmp 25408     1   0   Aug 04 ?          70:11 java -jar DealerSmsEmailAlert.jar
  wacgov 28044     1   0   Aug 04 ?         521:59 java -Xms6144m -Xmx8192m wac.framework.Workaholic start file_processor_bulk_gov
  waccmp 29755     1   0   Aug 04 ?         960:59 java -Xms6144m -Xmx8192m wac.framework.Workaholic start nefttxnposting_ext
  waccmp  1546     1   0 11:40:02 ?           9:06 java -jar -Dspring.profiles.active=prod /opt/sbi/wac/lib/appjars/cmp_H2H_intg_sftp-0.0.1-SNAPSHOT.jar
  waccmp 27496     1   0   Aug 04 ?         469:02 java -Xms256m -Xmx512m wac.framework.Workaholic start MRPortTxnPosting
  waccmp 28242     1   0   Aug 04 ?        2367:32 java -Xms6144m -Xmx8192m wac.framework.Workaholic start cmpsftp
  waccmp 29519     1   0   Aug 04 ?         492:31 java -Xms128m -Xmx2048m wac.framework.Workaholic start paymentadvice_huge
CENTRALGOV 14817     1  0   Aug 05 ?       1697:49 java -Xms2048m -Xmx3072m wac.framework.Workaholic start TrickleFeedNEFT_Gov_Central
  waccmp 29123     1   0   Aug 04 ?         914:26 java -Xms64m -Xmx3072m wac.framework.Workaholic start DDRPostingHuge
CENTRALGOV 15184     1  0   Aug 05 ?        636:02 java -Xms6144m -Xmx8192m wac.framework.Workaholic start reports_gov_Central
     qsb  3332  2781   0 09:30:01 ?           0:29 java -jar /opt/sbi/qsb/lib/appjars/mis-report.jar 3
  waccmp 29817     1   0   Aug 04 ?         631:23 java -Xms256m -Xmx512m wac.framework.Workaholic start sms_alert
  wacgov 28688     1   0   Aug 04 ?         469:07 java -Xms64m -Xmx1024m wac.framework.Workaholic start ReceiptRefundTxnPosting
  waccmp 29219     1   0   Aug 04 ?       35205:21 java -Xms6144m -Xmx8192m wac.framework.Workaholic start file_processor
  waccmp 29091     1   0   Aug 04 ?         717:08 java -Xms64m -Xmx3072m wac.framework.Workaholic start DDRPostingBulk
  waccmp 25442     1   0   Aug 04 ?         510:34 java -jar WBSEDCLRefund-0.0.1.jar
  waccmp 29727     1   0   Aug 04 ?         907:03 java -Xms6144m -Xmx8192m wac.framework.Workaholic start TransactionPosting_ext
  waccmp 16057     1   0   Aug 05 ?        7326:47 /opt/sbi/wac/JAVA/jdk1.8.0_bkp_16062026/jre/bin/java -Xms6144m -Xmx8192m wac.framework.Workaholic start impstransactionenquiry
    root 23196  4012   0 01:15:00 ?           0:40 java -jar /opt/snow/snowagent.jar --config /opt/snow/snowagent.config
  waccmp 29383     1   0   Aug 04 ?        2117:18 java -Xms6144m -Xmx8192m wac.framework.Workaholic start tricklefeed
    root 26308 23196   0 01:15:07 ?         596:30 /usr/jdk/instances/jdk1.8.0/jre/bin/java -jar /opt/snow/snowagent.jar -c /opt/snow/snowagent.config scan
  waccmp 26843     1   0   Aug 04 ?        1033:11 java -Xms256m -Xmx512m wac.framework.Workaholic start supplier
  wacgov 26874     1   0   Aug 04 ?         567:51 java -Xms64m -Xmx512m wac.framework.Workaholic start reptxnposting_gov
  waccmp 26512     1   0   Aug 04 ?        2706:10 java -Xms6144m -Xmx8192m wac.framework.Workaholic start file_processor_premium
  waccmp 28767     1   0   Aug 04 ?         708:28 java -Xms512m -Xmx1024m wac.framework.Workaholic start cmpnachack
  wacgov 28529     1   0   Aug 04 ?        2455:00 java -Xms6144m -Xmx8192m wac.framework.Workaholic start govEmro
  wacgov 28637     1   0   Aug 04 ?         856:45 java -Xms64m -Xmx1024m wac.framework.Workaholic start gov_receipt_refund
  waccmp 29452     1   0   Aug 04 ?         471:32 java -Xms512m -Xmx1024m wac.framework.Workaholic start paymentAdvicePrevDayEmail
  wacgov 27863     1   0   Aug 04 ?        1124:14 java -Xms64m -Xmx3072m wac.framework.Workaholic start file_processor_gov
  waccmp 29784     1   0   Aug 04 ?         712:45 java -Xms6144m -Xmx8192m wac.framework.Workaholic start rtgstxnposting
  waccmp 27348     1   0   Aug 04 ?         450:49 java -Xms256m -Xmx512m wac.framework.Workaholic start MRPortRePostTxn
  waccmp 29416     1   0   Aug 04 ?        1438:23 java -Xms6144m -Xmx8192m wac.framework.Workaholic start nefttxnposting
  waccmp 27065     1   0   Aug 04 ?       39791:24 java -Xms6144m -Xmx8192m wac.framework.Workaholic start file_processor_epfo
CENTRALGOV 13424     1  0   Aug 10 ?        364:04 java -Xms2048m -Xmx3072m wac.framework.Workaholic start MRPortRePostTxn_Gov_Central
CENTRALGOV 13528     1  0   Aug 05 ?        520:43 java -Xms2048m -Xmx3072m wac.framework.Workaholic start reptxnposting_gov_Central
  waccmp 29584     1   0   Aug 04 ?         761:18 java -Xms128m -Xmx2048m wac.framework.Workaholic start paymentAdviceEmail_bulk
  waccmp  3210     1   0   Aug 11 ?         450:39 java -jar EISScheduler.jar
  waccmp   659     1   0 15:01:04 ?          30:59 java -Xms6144m -Xmx8192m wac.framework.Workaholic start generateadvice
CENTRALGOV 14940     1  0   Aug 05 ?       1013:04 java -Xms2048m -Xmx3072m wac.framework.Workaholic start file_processor_huge_gov_Central
  waccmp 27613     1   0   Aug 04 ?        1230:07 java -Xms6144m -Xmx8192m wac.framework.Workaholic start e9statement
  waccmp 27093     1   0   Aug 04 ?         726:21 java -Xms512m -Xmx1024m wac.framework.Workaholic start mt940sftp
CENTRALGOV 13667     1  0   Aug 05 ?        542:53 java -Xms2048m -Xmx3072m wac.framework.Workaholic start TransactionCreation_gov_Central
  waccmp 26722     1   0   Aug 04 ?         460:25 java -Xms256m -Xmx512m wac.framework.Workaholic start precommunicationEmail
     qsb 18482 18345   0 00:00:00 ?         129:51 /usr/jdk/instances/jdk1.8.0/jre/bin/java -Xms64m -Xmx3072m -jar /opt/sbi/qsb/Mandate/mandate_shedular.jar 37
     qsb 25832 25635   0   Aug 05 ?          48:33 java -jar /opt/sbi/qsb/Mandate/FmcSmsAlert.jar
cmpsupport  3735     1  0   Aug 09 ?         16:15 java -jar mandate_shedular.jar 11
     qsb 26140     1   0   Aug 04 ?         476:01 java -jar CMPMonitoring.jar
  waccmp 29351     1   0   Aug 04 ?        1287:31 java -Xms6144m -Xmx8192m wac.framework.Workaholic start TransactionPosting
  waccmp  7371     1   0 10:50:04 ?         175:38 java -Xms6144m -Xmx8192m wac.framework.Workaholic start nachfilegen
     qsb  9815  9572   0 01:00:01 ?         125:25 /usr/jdk/instances/jdk1.8.0/jre/bin/java -Xms64m -Xmx3072m -jar /opt/sbi/qsb/Mandate/mandate_shedular.jar 37
  waccmp 28527     1   0   Aug 04 ?         465:54 java -Xms256m -Xmx512m wac.framework.Workaholic start BulkBillingPosting
CENTRALGOV 15040     1  0   Aug 05 ?       1104:04 java -Xms2048m -Xmx3072m wac.framework.Workaholic start file_processor_bulk_gov_Central
  waccmp 27769     1   0   Aug 04 ?       21227:04 java -Xms6144m -Xmx8192m wac.framework.Workaholic start xmlsftp
  wacgov 28105     1   0   Aug 04 ?         534:34 java -Xms6144m -Xmx8192m wac.framework.Workaholic start TrickleFeed_Gov
  waccmp 29948     1   0   Aug 04 ?        2266:05 java -Xms64m -Xmx3072m com.sbi.gateway.creator.GatewayStarter start CGOVserver6803
  waccmp 28945     1   0   Aug 04 ?         575:22 java -Xms64m -Xmx3072m wac.framework.Workaholic start tricklefeedneft
CENTRALGOV 14543     1  0   Aug 05 ?       1881:39 java -Xms2048m -Xmx3072m wac.framework.Workaholic start ITRO_TIN_FASTPLUS
  waccmp 29179     1   0   Aug 04 ?       11099:00 java -Xms6144m -Xmx8192m wac.framework.Workaholic start file_processor_bulk
  waccmp 29670     1   0   Aug 04 ?         499:33 java -Xms128m -Xmx2048m wac.framework.Workaholic start paymentAdviceEmail_huge
CENTRALGOV 14317     1  0   Aug 05 ?        457:55 java -Xms2048m -Xmx3072m wac.framework.Workaholic start ITRO_Payment_Advice_Email
     qsb 24349     1   0   Aug 20 ?         884:40 java -Xms64m -Xmx3072m StartSpringBatchScheduler fileprocessor
CENTRALGOV 14180     1  0   Aug 05 ?        488:50 java -Xms2048m -Xmx3072m wac.framework.Workaholic start ITRO_Payment_Advice
     qsb  3186  3120   0   Aug 05 ?          38:20 /usr/jdk/instances/jdk1.8.0/jre/bin/java -Xms64m -Xmx3072m -jar /opt/sbi/qsb/Mandate/mandate_shedular.jar 12
  waccmp  3305     1   0   Aug 09 ?        2272:31 java -jar -Dspring.profiles.active=prod-pr /opt/sbi/wac/integration/CMP_MT940_INTG_SFTP.jar
  waccmp 28591     1   0   Aug 04 ?        2766:53 java -Xms6144m -Xmx8192m wac.framework.Workaholic start TransactionEnquiry
  waccmp 28067     1   0   Aug 04 ?         557:38 java -Xms256m -Xmx512m wac.framework.Workaholic start beneficiary_processor
  waccmp 29916     1   0   Aug 04 ?         466:15 java -Xms64m -Xmx3072m com.sbi.gateway.creator.GatewayStarter start COLLserver6801
     qsb 26410     1   0   Aug 04 ?         451:57 java -Xms64m -Xmx3072m com.sbi.gateway.creator.GatewayStarter start MANDserver6802
  wacgov 21086     1   0   Aug 18 ?         355:28 java -Xms6144m -Xmx8192m wac.framework.Workaholic start reports_gov
CENTRALGOV 13801     1  0   Aug 05 ?        558:24 java -Xms2048m -Xmx3072m wac.framework.Workaholic start TransactionEnquiry_gov_Central
CENTRALGOV 13384     1  0   Aug 05 ?        493:28 java -Xms2048m -Xmx3072m wac.framework.Workaholic start nefttxnposting_gov_Central
     qsb 27692     1   0   Aug 15 ?         482:25 java -Xms1024m -Xmx4096m StartSpringBatchScheduler offusprocessor
CENTRALGOV  7526     1  0   Aug 05 ?      12587:12 java -Xms2048m -Xmx3072m wac.framework.Workaholic start triggerSms_Central
CENTRALGOV 14707     1  0   Aug 05 ?        888:08 java -Xms2048m -Xmx3072m wac.framework.Workaholic start TrickleFeed_Gov_Central
  waccmp 26592     1   0   Aug 04 ?         505:40 java -Xms512m -Xmx1024m wac.framework.Workaholic start webservice_reversefeed
  waccmp  9092     1   0   Aug 04 ?          59:40 java -jar /opt/sbi/wac/collections/ConsolidatedCreditAutoSweep.jar
  waccmp 28326     1   0   Aug 04 ?         537:26 java -Xms256m -Xmx512m wac.framework.Workaholic start cmp_auth_processor
  wacgov 27945     1   0   Aug 04 ?         461:49 java -Xms6144m -Xmx8192m wac.framework.Workaholic start file_processor_huge_gov
  waccmp 13547     1   0   Aug 24 ?         223:03 java -jar -Dspring.profiles.active=prod /opt/sbi/wac/integration/cmp_corp_onboarding_intg.jar
CENTRALGOV 28691     1  0   Aug 21 ?        801:55 java -Xms6144m -Xmx8192m wac.framework.Workaholic start Itro_Payload_Gov
     qsb 13625  9230   0 09:31:29 pts/56      0:00 grep -i java





  qsb@cmpmtxn72:~$ pcred 25299
25299:  e/r/suid=1030  e/r/sgid=1
qsb@cmpmtxn72:~$ ps -ef | grep "25299"
     qsb 11901  9230   0 09:35:55 pts/56      0:00 grep 25299
     qsb 25299     1   0   Aug 04 ?         370:43 java -Xms64m -Xmx3072m StartSpringBatchScheduler smsmandates
qsb@cmpmtxn72:~$ ptree 25299
25299 java -Xms64m -Xmx3072m StartSpringBatchScheduler smsmandates
qsb@cmpmtxn72:~$ grep -Rni "umask" /opt/sbi/qsb /etc/init.d/ /etc/default 2>/dev/null
qsb@cmpmtxn72:~$ grep -Rni "StartSpringBatchScheduler smsmandates" /opt/sbi/qsb /etc 2>/dev/null
