package dev.simplesolution.downloadzip.service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface DownloadService {
    /**
     * To create and write .zip file to the response's ouput stream.
     * @param response
     * @param listOfFileNames
     */
    void downloadZipFile(HttpServletResponse response, List<String> listOfFileNames);
}
