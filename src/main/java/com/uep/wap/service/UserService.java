package com.uep.wap.service;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.User;

public interface UserService
{
    User save(UserDTO userDTO);
}
