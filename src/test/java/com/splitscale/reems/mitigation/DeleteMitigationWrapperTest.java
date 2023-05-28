package com.splitscale.reems.mitigation;

import com.splitscale.reems.mitigation.delete.DeleteMitigationInteractor;
import com.splitscale.reems.wrappers.mitigation.delete.DeleteMitigationWrapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.security.GeneralSecurityException;

import static org.mockito.Mockito.*;

public class DeleteMitigationWrapperTest {

    @Mock
    private DeleteMitigationInteractor interactor;

    private DeleteMitigationWrapper wrapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        wrapper = new DeleteMitigationWrapper(interactor);
    }

    @Test
    public void testDeleteMitigation() throws IOException, GeneralSecurityException {
        // Arrange
        String id = "123";

        // Act
        wrapper.delete(id);

        // Assert
        verify(interactor, times(1)).deleteMitigation(id);
    }
}