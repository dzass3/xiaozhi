package com.itheima.java.ai.langchin4j.server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.java.ai.langchin4j.entity.Appointment;

public interface AppointmentService extends IService<Appointment> {
 Appointment getOne(Appointment appointment);
}
 