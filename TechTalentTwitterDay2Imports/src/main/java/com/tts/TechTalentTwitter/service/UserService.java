package com.tts.TechTalentTwitter.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tts.TechTalentTwitter.model.Role;
import com.tts.TechTalentTwitter.model.User;
import com.tts.TechTalentTwitter.repository.RoleRepository;
import com.tts.TechTalentTwitter.repository.UserRepository;