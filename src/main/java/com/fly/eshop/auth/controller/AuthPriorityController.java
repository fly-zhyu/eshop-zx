package com.fly.eshop.auth.controller;

import com.fly.eshop.auth.dto.AuthPriorityDTO;
import com.fly.eshop.auth.entity.AuthPriority;
import com.fly.eshop.auth.service.AuthPriorityService;
import com.fly.eshop.auth.vo.AuthPriorityVO;
import com.fly.eshop.common.constant.BaseRuntimeException;
import com.fly.eshop.common.constant.ShopResultEnum;
import com.fly.eshop.common.util.BeanConvertUtil;
import com.fly.eshop.common.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 权限表，每个权限代表了系统中的一个菜单、按钮、URL请求(AuthPriority)表控制层
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@Slf4j
@RestController
@RequestMapping("/authPriority")
public class AuthPriorityController {

    /**
     * 服务对象
     */
    @Resource
    private AuthPriorityService priorityService;

    /**
     * 查询根权限(parentId is null)
     *
     * @return 根权限集合
     */
    @GetMapping("/root")
    public List<AuthPriorityVO> listRootPriorities() {
        List<AuthPriorityDTO> priorityDTOList = priorityService.listRootPriorities();
        return BeanConvertUtil.convertListToOtherList(priorityDTOList, AuthPriorityVO.class);
    }

    /**
     * 根据父权限id查询子权限
     *
     * @param parentId
     * @return
     */
    @GetMapping("/child/{parentId}")
    public List<AuthPriorityVO> listChildPriorities(@PathVariable("parentId") Long parentId) {
        List<AuthPriorityDTO> priorityDTOList = priorityService.listChildPriorities(parentId);
        return BeanConvertUtil.convertListToOtherList(priorityDTOList, AuthPriorityVO.class);
    }

    /**
     * 根据id查询权限
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResultVO<AuthPriorityVO> getPriorityById(@PathVariable("id")Long id){
        AuthPriority authPriority = priorityService.queryById(id);
        return new ResultVO<AuthPriorityVO>().success(BeanConvertUtil.convertBeanToOtherBean(authPriority, AuthPriorityVO.class));
    }

    @PostMapping
    public ResultVO<Boolean> savePriority(@RequestBody AuthPriorityVO priorityVO){
        AuthPriorityDTO authPriorityDTO = BeanConvertUtil.convertBeanToOtherBean(priorityVO, AuthPriorityDTO.class);
        return new ResultVO<Boolean>().success(priorityService.savePriority(authPriorityDTO));
    }

    @PutMapping("/{id}")
    public ResultVO<Boolean> updatePriority(@PathVariable("id")Long id, @RequestBody AuthPriorityVO priorityVO){
        AuthPriority authPriority = BeanConvertUtil.convertBeanToOtherBean(priorityVO, AuthPriority.class);
        authPriority.setId(id);
        priorityService.update(authPriority);
        return new ResultVO<Boolean>().success(true);
    }

    @DeleteMapping("/{id}")
    public ResultVO<Boolean> removePriortiy(@PathVariable("id")Long id){
        return new ResultVO<Boolean>().success(true);
    }

}