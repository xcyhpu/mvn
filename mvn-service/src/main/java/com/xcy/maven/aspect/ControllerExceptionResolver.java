package com.xcy.maven.aspect;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yehongyu on 15/7/6.
 */
public class ControllerExceptionResolver extends SimpleMappingExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionResolver.class);

    @Override
    public ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response,
                                           Object handler, Exception ex){
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("resp", -1);
            map.put("msg", "系统发生异常");
            map.put("data", ex.getLocalizedMessage());
            JSONObject json = new JSONObject();
            json.putAll(map);

            response.setContentType("application/json;charset=UTF-8");
            Writer writer = response.getWriter();
            writer.write(json.toJSONString());
            writer.close();
        } catch (IOException e) {
            ControllerExceptionResolver.logger.error("ERROR ## write message happened error, the trace ", e);
        }
        return null;
    }
}
