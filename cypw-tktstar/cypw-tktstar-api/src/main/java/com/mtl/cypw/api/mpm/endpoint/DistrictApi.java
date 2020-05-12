package com.mtl.cypw.api.mpm.endpoint;

import com.juqitech.response.TMultiResult;
import com.mtl.cypw.domain.mpm.dto.DistrictDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author tang.
 * @date 2019/11/27.
 */
public interface DistrictApi {

    /**
     * 查询所有区
     * @return
     */
    @RequestMapping(value = "/endpoint/v1/mpm/districts", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    TMultiResult<DistrictDTO> districts();
}
