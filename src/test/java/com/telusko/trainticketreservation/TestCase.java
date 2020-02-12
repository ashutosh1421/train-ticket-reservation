package com.telusko.trainticketreservation;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.telusko.trainticketreservation.model.train;
import com.telusko.trainticketreservation.repository.trainRepository;
import com.telusko.trainticketreservation.service.TrainService;

//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class TestCase {

	@InjectMocks
	public TrainService testTrain;

	@Mock
	public trainRepository repository;

	public train tr;

	@Before
	public void init() {

		MockitoAnnotations.initMocks(this);

		tr = new train(6769, "Shatabdi Express", "Ghaziabad", "Pune", 251);
	}

	@Test
	public void saveTrain() {
		assertEquals(6769, testTrain.saveTrai(tr));
	}

	@Test
	public void testGetTrain() {
		assertEquals(0, testTrain.getTrains().size());
	}

	@Test
	public void testGetTrainById() {
		assertEquals(tr.getClass(), testTrain.getTrain(6769).getClass());
	}

	@Test
	public void testDeleteTrain() {
		assertEquals(6769, 6769);
	}
}
