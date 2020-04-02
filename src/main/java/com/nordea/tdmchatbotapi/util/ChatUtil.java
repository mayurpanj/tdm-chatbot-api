package com.nordea.tdmchatbotapi.util;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nordea.tdmchatbotapi.service.UserChatServiceImpl;

public class ChatUtil {

	private static final Logger LOG = LoggerFactory.getLogger(UserChatServiceImpl.class);

	public static String getResourcesPath() {
		File currDir = new File(".");
		String path = currDir.getAbsolutePath();
		path = path.substring(0, path.length() - 2);
		LOG.info("The AIML path is:"+ path);
		String resourcesPath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
		return resourcesPath;
	}
}

