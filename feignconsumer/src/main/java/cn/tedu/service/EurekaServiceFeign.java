package cn.tedu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(value="provide-user")
public interface EurekaServiceFeign {
	@RequestMapping(value="/hello/{name}")
	public String hello(@PathVariable("name") String name);
}
